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
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;


/**
 * Event-B EMF Context Element Refiner 
 * 
 * @author cfsnook
 *
 */
public class ContextElementRefiner extends CoreElementRefiner {

	/**
	 * populate the given list with the meta-classes that the refiner needs to filter out
	 *  from the copy for refinement.
	 *  
	 *  for Context everything is filtered out
	 *   
	 */
	@Override
	protected void populateFilterByTypeList(final List<EClass> filterList){
		super.populateFilterByTypeList(filterList);
		filterList.add(ContextPackage.Literals.AXIOM);
		filterList.add(ContextPackage.Literals.CARRIER_SET);
		filterList.add(ContextPackage.Literals.CONSTANT);
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
		referencemap.put(ContextPackage.Literals.CONTEXT__EXTENDS, RefHandling.CHAIN);
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
	 * Overridden to correct Context name
	 */
	@Override
	protected void copyReferences(EObject concreteElement, Copier copier, URI abstractUri, 
			URI concreteResourceURI, EventBNamedCommentedComponentElement concreteComponent, String concreteComponentName, Mode mode ) {
		
		if (concreteElement instanceof Context) {
			((Context)concreteElement).setName(concreteComponentName==null? concreteResourceURI.trimFileExtension().lastSegment() : concreteComponentName);
		}
		
		super.copyReferences(concreteElement, copier, abstractUri, concreteResourceURI, concreteComponent, concreteComponentName, mode);
	}
	
}
