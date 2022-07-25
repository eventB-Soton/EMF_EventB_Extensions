/*******************************************************************************
 * Copyright (c) 2011, 2019 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    University of Southampton - initial API and implementation
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
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup;

/**
 * Coreextension Element Refiner 
 * 
 * @author cfsnook
 *
 */
public class CoreextensionElementRefiner extends CoreElementRefiner {

	/**
	 * populate the given list with the meta-classes that the refiner needs to filter out
	 *  from the refinement.
	 */
	@Override
	protected void populateFilterByTypeList(final List<EClass> filterList){
		super.populateFilterByTypeList(filterList);
		filterList.add(MachinePackage.Literals.WITNESS);	//used in EventBEventGroup
		filterList.add(MachinePackage.Literals.GUARD);		//used in EventBEventGroup - filter because extended
		filterList.add(MachinePackage.Literals.ACTION);		//used in EventBEventGroup - filter because extended
	}
	
	/**
	 * populate the given map with the reference features that the refiner needs to copy 
	 * for refinement.
	 * 
	 * 
	 */
	@Override
	protected void populateReferenceMap(final Map<EReference,RefHandling> referencemap){
		super.populateReferenceMap(referencemap);
		referencemap.put(CoreextensionPackage.Literals.EVENT_BDATA_ELABORATION__ELABORATES, RefHandling.EQUIV);
		referencemap.put(CoreextensionPackage.Literals.EVENT_BEVENT_GROUP__ELABORATES, RefHandling.EQUIV);
		referencemap.put(CoreextensionPackage.Literals.EVENT_BEVENT_GROUP__REFINES, RefHandling.CHAIN);
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
	 * Overridden to extend all event groups
	 */
	@Override
	protected void copyReferences(EObject concreteElement, Copier copier, URI abstractUri, 
			URI concreteResourceURI, EventBNamedCommentedComponentElement concreteComponent, String concreteComponentName, Mode mode ) {
		

		super.copyReferences(concreteElement, copier, abstractUri, concreteResourceURI, concreteComponent, concreteComponentName, mode);

		if (concreteElement instanceof EventBEventGroup) {
			((EventBEventGroup)concreteElement).setExtended(true);
		}
	}

}
