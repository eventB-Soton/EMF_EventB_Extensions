/**
 * Copyright (c) 2012-2018 - University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.core.extension.coreextension;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Witness;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event BEvent Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getElaborates <em>Elaborates</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#isExtended <em>Extended</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getGuards <em>Guards</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getActions <em>Actions</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getWitnesses <em>Witnesses</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getRefines <em>Refines</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup()
 * @model abstract="true"
 * @generated
 */
public interface EventBEventGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Elaborates</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elaborates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elaborates</em>' reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Elaborates()
	 * @model
	 * @generated
	 */
	EList<Event> getElaborates();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' attribute.
	 * @see #setExtended(boolean)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Extended()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isExtended();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#isExtended <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' attribute.
	 * @see #isExtended()
	 * @generated
	 */
	void setExtended(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.core.extension.coreextension.TypedParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Guard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' containment reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Guards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guard> getGuards();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Witnesses</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Witness}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Witnesses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Witnesses</em>' containment reference list.
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Witnesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Witness> getWitnesses();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(EventBEventGroup)
	 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage#getEventBEventGroup_Refines()
	 * @model
	 * @generated
	 */
	EventBEventGroup getRefines();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(EventBEventGroup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IF the event group isExtended and refines a valid refined eventGroup,
	 * returns a list of the extended parameters,
	 * i.e. parameters and extended parameters of the refined eventGroup.
	 * (n.b. does NOT include the local parameters owned by this eventGroup)
	 * <!-- end-model-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tList&lt;TypedParameter&gt; ret = new  ArrayList&lt;TypedParameter&gt;();\n\t\tif (this.isExtended() &amp;&amp; this.getRefines()!=null &amp;&amp; this.getRefines()!=this) {\n\t\t\tret.addAll(this.getRefines().getParameters());\n\t\t\tret.addAll(this.getRefines().getExtendedParameters());\n\t\t}\n\t\treturn new BasicEList.UnmodifiableEList&lt;TypedParameter&gt;(ret.size(),ret.toArray()) ;'"
	 * @generated
	 */
	EList<TypedParameter> getExtendedParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IF the event group isExtended and refines a valid refined eventGroup,
	 * returns a list of the extended guards,
	 * i.e. guards and extended guards of the refined eventGroup.
	 * (n.b. does NOT include the local guards owned by this eventGroup)
	 * <!-- end-model-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tList&lt;Guard&gt; ret = new  ArrayList&lt;Guard&gt;();\n\t\tif (this.isExtended() &amp;&amp; this.getRefines()!=null &amp;&amp; this.getRefines()!=this) {\n\t\t\tret.addAll(this.getRefines().getGuards());\n\t\t\tret.addAll(this.getRefines().getExtendedGuards());\n\t\t}\n\t\treturn new BasicEList.UnmodifiableEList&lt;Guard&gt;(ret.size(),ret.toArray()) ;'"
	 * @generated
	 */
	EList<Guard> getExtendedGuards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IF the event group isExtended and refines a valid refined eventGroup,
	 * returns a list of the extended actions,
	 * i.e. actions and extended actions of the refined eventGroup.
	 * (n.b. does NOT include the local actions owned by this eventGroup)
	 * <!-- end-model-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tList&lt;Action&gt; ret = new  ArrayList&lt;Action&gt;();\n\t\tif (this.isExtended() &amp;&amp; this.getRefines()!=null &amp;&amp; this.getRefines()!=this) {\n\t\t\tret.addAll(this.getRefines().getActions());\n\t\t\tret.addAll(this.getRefines().getExtendedActions());\n\t\t}\n\t\treturn new BasicEList.UnmodifiableEList&lt;Action&gt;(ret.size(),ret.toArray()) ;'"
	 * @generated
	 */
	EList<Action> getExtendedActions();

} // EventBEventGroup
