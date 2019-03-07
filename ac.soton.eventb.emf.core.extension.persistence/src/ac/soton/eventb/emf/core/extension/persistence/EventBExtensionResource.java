/**
 * Copyright (c) 2019 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.core.extension.persistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * This resource forces the encoded attribute style to be used for extensions that are persisted as XMI 
 * (i.e. separate from Rodin).
 * 
 * This style is needed because our reference id's contain semicolons ':' which are misinterpreted
 * by the parser unless there is a resource part to the reference. 
 * If there is a resource part the remainder after the delimiter (#) is interpreted correctly as an id.
 * (i.e. at least a # character must be prefixed for the XMLHandler to parse the reference correctly)
 * The Encoded attribute style always includes a resource part even if it is empty (i.e. the local file)
 * resulting in a single # as a prefix. 
 * 
 * @since 2.3
 */
public class EventBExtensionResource extends XMIResourceImpl {

	public EventBExtensionResource(URI uri) {
		super(uri);
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public void save(Map<?, ?> options) throws IOException {
		Map options_encoded_attributes = new HashMap( options);
		options_encoded_attributes.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		super.save(options_encoded_attributes);
	}

}
