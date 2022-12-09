/*******************************************************************************
 * Copyright (c) 2011, 2016 University of Southampton.
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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public class ElementRefinerRegistry {

	// The shared instance
	private static ElementRefinerRegistry registry = null;
	
	//cached store of generator configurations that have been loaded from extension points
	private Map<EPackage, AbstractElementRefiner> map = new HashMap<EPackage, AbstractElementRefiner>();
	
	/*
	 * The constructor for the shared instance of registry,
	 * populates the map of generator configurations from extensions point
	 */
	private ElementRefinerRegistry() {
		// populate generator configuration data from registered extensions
		for (final IExtension extension : Platform.getExtensionRegistry().getExtensionPoint(Identifiers.EXTPT_REFINER_ID).getExtensions()) {
			for (final IConfigurationElement configurationElement : extension.getConfigurationElements()) {
				EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(configurationElement.getAttribute(Identifiers.EXTPT_REFINER_EPACKAGE));
				AbstractElementRefiner refiner;
				try {
					refiner = (AbstractElementRefiner) configurationElement.createExecutableExtension(Identifiers.EXTPT_REFINER_REFINERCLASS);
					map.put(ePackage, refiner);
				} catch (CoreException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	
	public static ElementRefinerRegistry getRegistry(){
		if (registry == null){
			registry = new ElementRefinerRegistry();
		}
		return registry;
	}

	public boolean canRefine(String nsURI){
		EPackage ePackage =  EPackage.Registry.INSTANCE.getEPackage(nsURI);	
		return map.containsKey(ePackage);
	}
	
	/**
	 * get a refiner for the given EObject
	 * (equivalent to getRefiner(eObject.eClass().getEPackage().getNsURI()))
	 * 
	 * @param eObject
	 * @return refiner
	 */
	public AbstractElementRefiner getRefiner(EObject eObject){
		if (eObject==null) 
			return null;
		return getRefiner(eObject.eClass().getEPackage().getNsURI());
	}
	
	/**
	 * Get the Refiner for a particular eCore Package nsURI
	 * 	
	 * @param String nsURI
	 * @return refiner
	 */	
	public AbstractElementRefiner getRefiner(String nsURI){ 
		EPackage ePackage =  EPackage.Registry.INSTANCE.getEPackage(nsURI);
		return map.get(ePackage);
	}

}
