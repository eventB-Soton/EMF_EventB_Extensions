/*******************************************************************************
 * Copyright (c) 2011, 2018 University of Southampton.
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
package ac.soton.eventb.emf.core.extension.navigator.provider;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * Navigator item for event-b extensions and their children,
 * basically a wrapper for EObject elements.
 * Copied from GMF generated navigator items for diagrams.
 * 
 * @author vitaly
 *
 */
public class ExtensionNavigatorItem extends PlatformObject {
	static {
		@SuppressWarnings("rawtypes")
		final Class[] supportedTypes = new Class[] { EObject.class,
				IPropertySource.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					@SuppressWarnings({ "rawtypes", "unchecked" })
					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof ExtensionNavigatorItem) {
							ExtensionNavigatorItem domainNavigatorItem = (ExtensionNavigatorItem) adaptableObject;
							EObject eObject = domainNavigatorItem.getEObject();
							if (adapterType == EObject.class) {
								return eObject;
							}
							if (adapterType == IPropertySource.class) {
								return domainNavigatorItem
										.getPropertySourceProvider()
										.getPropertySource(eObject);
							}
						}

						return null;
					}

					@SuppressWarnings({ "rawtypes", "unchecked" })
					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				ExtensionNavigatorItem.class);
	}
	
	private Object myParent;

	private EObject myEObject;

	private IPropertySourceProvider myPropertySourceProvider;

	public ExtensionNavigatorItem(EObject eObject, Object parent,
			IPropertySourceProvider propertySourceProvider) {
		myParent = parent;
		myEObject = eObject;
		myPropertySourceProvider = propertySourceProvider;
	}

	public Object getParent() {
		return myParent;
	}

	public EObject getEObject() {
		return myEObject;
	}

	public IPropertySourceProvider getPropertySourceProvider() {
		return myPropertySourceProvider;
	}

	public boolean equals(Object obj) {
		if (obj instanceof ExtensionNavigatorItem) {
			return EcoreUtil
					.getURI(getEObject())
					.equals(EcoreUtil
							.getURI(((ExtensionNavigatorItem) obj)
									.getEObject()));
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return EcoreUtil.getURI(getEObject()).hashCode();
	}
}
