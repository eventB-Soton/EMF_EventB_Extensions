/*******************************************************************************
 * Copyright (c) 2012-2019 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package ac.soton.eventb.emf.core.extension.navigator.refiner;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

/**
 * Event-B EMF Machine Element Refiner 
 * 
 * @author cfsnook
 *
 */
public class MachineElementRefiner extends CoreElementRefiner {

	/**
	 * populate the given list with the meta-classes that the refiner needs to filter out
	 *  from the copy for refinement.
	 *  
	 * filter MachinePackage.Literals.WITNESS and  MachinePackage.Literals.INVARIANT because they are only relevant
	 * for one refinement level
	 *   
	 * filter MachinePackage.Literals.PARAMETER, MachinePackage.Literals.GUARD and MachinePackage.Literals.ACTION
	 * because we default refined events to extended
	 *   
	 */
	@Override
	protected void populateFilterByTypeList(final List<EClass> filterList){
		super.populateFilterByTypeList(filterList);
		filterList.add(MachinePackage.Literals.PARAMETER);
		filterList.add(MachinePackage.Literals.WITNESS);
		filterList.add(MachinePackage.Literals.GUARD);
		filterList.add(MachinePackage.Literals.ACTION);
		filterList.add(MachinePackage.Literals.INVARIANT);
	}
	
	/**
	 * populate the given map with the reference features that the refiner needs to copy for statemachine refinement.
	 * This is refines (as references to their abstract counterparts) and
	 * incoming, outgoing, source and target (as intra-level references).
	 * Instances
	 */
	@Override
	protected void populateReferenceMap(final Map<EReference,RefHandling> referencemap){
		super.populateReferenceMap(referencemap);
		referencemap.put(MachinePackage.Literals.EVENT__REFINES, RefHandling.CHAIN);
		referencemap.put(MachinePackage.Literals.MACHINE__REFINES, RefHandling.CHAIN);
		referencemap.put(MachinePackage.Literals.MACHINE__SEES, RefHandling.DROP); 	//EQUIV does not work and defaults to COPY which is often not what we want.. better to do manually
	}

	/**
	 * Change this to specialise the meaning of 'equivalent' 
	 * (used when finding reference targets in the refined model)
	 * 
	 */
	public EventBObject getEquivalentObject(EObject concreteParent, EObject abstractObject) {
		return super.getEquivalentObject(concreteParent, abstractObject);
	}
	
	/**
	 * Overridden to correct the Machine name,
	 *  ensure INITIALISATION event does not refine anything
	 *  and extend all events
	 */
	@Override
	protected void copyReferences(EObject concreteElement, Copier copier, URI abstractUri, 
			URI concreteResourceURI, EventBNamedCommentedComponentElement concreteComponent, String concreteComponentName, Mode mode ) {
		
		
		if (concreteElement instanceof Machine) {
			((Machine)concreteElement).setName(concreteComponentName==null? concreteResourceURI.trimFileExtension().lastSegment() : concreteComponentName);
		}

		super.copyReferences(concreteElement, copier, abstractUri, concreteResourceURI, concreteComponent, concreteComponentName, mode);

		if(concreteElement instanceof Event && "INITIALISATION".equals(((Event)concreteElement).getName())){
			((Event)concreteElement).getRefines().clear();
		}
		if (concreteElement instanceof Event) {
			((Event)concreteElement).setExtended(true);
		}
		
	}

	
}
