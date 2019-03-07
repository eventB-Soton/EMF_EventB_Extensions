/**
 * Copyright (c) 2019 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.core.extension.persistence;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * @author cfs
 * @since 2.3
 *
 */
public class EventBExtensionResourceFactory extends XMIResourceFactoryImpl{

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory#createResource(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public Resource createResource(final URI uri) {
		
		return new EventBExtensionResource(uri);
		
	}

}
