/*******************************************************************************
 * Copyright (c) 2011, 2022 University of Southampton.
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
package ac.soton.eventb.emf.core.extension.coreextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage
 * @generated
 */
public interface CoreextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreextensionFactory eINSTANCE = ac.soton.eventb.emf.core.extension.coreextension.impl.CoreextensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Typed Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Parameter</em>'.
	 * @generated
	 */
	TypedParameter createTypedParameter();

	/**
	 * Returns a new object of class '<em>Typed Variable</em>'.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Variable</em>'.
	 * @generated
	 */
	TypedVariable createTypedVariable();

	/**
	 * Returns a new object of class '<em>Typed Constant</em>'.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Constant</em>'.
	 * @generated
	 */
	TypedConstant createTypedConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoreextensionPackage getCoreextensionPackage();

} //CoreextensionFactory
