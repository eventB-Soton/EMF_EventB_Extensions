/**
 * Copyright (c) 2012-2014 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.emf.core.extension.coreextension;

import org.eventb.emf.core.machine.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.FormalParameter#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getFormalParameter()
 * @model
 * @generated
 */
public interface FormalParameter extends Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012-2014 - University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ac.soton.eventb.emf.core.extension.coreextension.INOUT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.INOUT
	 * @see #setDirection(INOUT)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getFormalParameter_Direction()
	 * @model required="true"
	 * @generated
	 */
	INOUT getDirection();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.FormalParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.INOUT
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(INOUT value);

} // FormalParameter
