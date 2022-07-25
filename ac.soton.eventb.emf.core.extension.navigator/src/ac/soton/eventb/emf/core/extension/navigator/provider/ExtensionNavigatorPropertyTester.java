/*******************************************************************************
 * Copyright (c) 2011, 2014 University of Southampton.
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

import org.eclipse.core.expressions.PropertyTester;
import org.eventb.core.IEventBRoot;

/**
 * Extension navigator property tester.
 * 
 * @author vitaly
 *
 */
public class ExtensionNavigatorPropertyTester extends PropertyTester {

	private static final Object PROPERTY_EVENTB_ROOT_CHILD = "eventBRootChild";

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		assert receiver instanceof ExtensionNavigatorItem : "Tested property receiver is not a ExtensionNavigatorItem";
		ExtensionNavigatorItem item = (ExtensionNavigatorItem) receiver;
		if (PROPERTY_EVENTB_ROOT_CHILD.equals(property)) {
			return Boolean.parseBoolean(expectedValue.toString()) == item.getParent() instanceof IEventBRoot;
		}
		assert false;
		return false;
	}

}
