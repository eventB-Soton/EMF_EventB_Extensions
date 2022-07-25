/*******************************************************************************
 * Copyright (c) 2011, 2015 University of Southampton.
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

import org.eclipse.osgi.util.NLS;

public class Identifiers extends NLS {
	private static final String BUNDLE_NAME = "ac.soton.eventb.emf.core.extension.navigator.refiner.identifiers"; //$NON-NLS-1$
	public static String EXTPT_REFINER_ID;
	public static String EXTPT_REFINER_EPACKAGE;
	public static String EXTPT_REFINER_REFINERCLASS;

	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Identifiers.class);
	}

	private Identifiers() {
	}
	

}

