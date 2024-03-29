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
package ac.soton.eventb.emf.core.extension.coreextension.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.EventBCommented;
import org.eventb.emf.core.EventBCommentedElement;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBNamedCommentedElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.machine.Parameter;

import org.eventb.emf.core.machine.Variable;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledEventGroupElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBDataElaboration;
import ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup;
import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;
import ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedDataElaborationElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedRelationDataElaborationElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBRelationKind;
import ac.soton.eventb.emf.core.extension.coreextension.Type;
import ac.soton.eventb.emf.core.extension.coreextension.Value;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;
import ac.soton.eventb.emf.core.extension.coreextension.TypedConstant;
import ac.soton.eventb.emf.core.extension.coreextension.TypedVariable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage
 * @generated
 */
public class CoreextensionSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoreextensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreextensionSwitch() {
		if (modelPackage == null) {
			modelPackage = CoreextensionPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	//@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CoreextensionPackage.TYPED_PARAMETER: {
				TypedParameter typedParameter = (TypedParameter)theEObject;
				T result = caseTypedParameter(typedParameter);
				if (result == null) result = caseParameter(typedParameter);
				if (result == null) result = caseType(typedParameter);
				if (result == null) result = caseValue(typedParameter);
				if (result == null) result = caseEventBNamedCommentedElement(typedParameter);
				if (result == null) result = caseEventBCommentedElement(typedParameter);
				if (result == null) result = caseEventBNamed(typedParameter);
				if (result == null) result = caseEventBElement(typedParameter);
				if (result == null) result = caseEventBCommented(typedParameter);
				if (result == null) result = caseEventBObject(typedParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.EVENT_BLABELED: {
				EventBLabeled eventBLabeled = (EventBLabeled)theEObject;
				T result = caseEventBLabeled(eventBLabeled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.EVENT_BRELATION_KIND: {
				EventBRelationKind eventBRelationKind = (EventBRelationKind)theEObject;
				T result = caseEventBRelationKind(eventBRelationKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.EVENT_BDATA_ELABORATION: {
				EventBDataElaboration eventBDataElaboration = (EventBDataElaboration)theEObject;
				T result = caseEventBDataElaboration(eventBDataElaboration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.EVENT_BEVENT_GROUP: {
				EventBEventGroup eventBEventGroup = (EventBEventGroup)theEObject;
				T result = caseEventBEventGroup(eventBEventGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT: {
				EventBCommentedLabeledEventGroupElement eventBCommentedLabeledEventGroupElement = (EventBCommentedLabeledEventGroupElement)theEObject;
				T result = caseEventBCommentedLabeledEventGroupElement(eventBCommentedLabeledEventGroupElement);
				if (result == null) result = caseEventBCommentedLabeledElement(eventBCommentedLabeledEventGroupElement);
				if (result == null) result = caseEventBEventGroup(eventBCommentedLabeledEventGroupElement);
				if (result == null) result = caseEventBCommentedElement(eventBCommentedLabeledEventGroupElement);
				if (result == null) result = caseEventBLabeled(eventBCommentedLabeledEventGroupElement);
				if (result == null) result = caseEventBElement(eventBCommentedLabeledEventGroupElement);
				if (result == null) result = caseEventBCommented(eventBCommentedLabeledEventGroupElement);
				if (result == null) result = caseEventBObject(eventBCommentedLabeledEventGroupElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_ELEMENT: {
				EventBCommentedLabeledElement eventBCommentedLabeledElement = (EventBCommentedLabeledElement)theEObject;
				T result = caseEventBCommentedLabeledElement(eventBCommentedLabeledElement);
				if (result == null) result = caseEventBCommentedElement(eventBCommentedLabeledElement);
				if (result == null) result = caseEventBLabeled(eventBCommentedLabeledElement);
				if (result == null) result = caseEventBElement(eventBCommentedLabeledElement);
				if (result == null) result = caseEventBCommented(eventBCommentedLabeledElement);
				if (result == null) result = caseEventBObject(eventBCommentedLabeledElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT: {
				EventBNamedCommentedDataElaborationElement eventBNamedCommentedDataElaborationElement = (EventBNamedCommentedDataElaborationElement)theEObject;
				T result = caseEventBNamedCommentedDataElaborationElement(eventBNamedCommentedDataElaborationElement);
				if (result == null) result = caseEventBNamedCommentedElement(eventBNamedCommentedDataElaborationElement);
				if (result == null) result = caseEventBDataElaboration(eventBNamedCommentedDataElaborationElement);
				if (result == null) result = caseEventBCommentedElement(eventBNamedCommentedDataElaborationElement);
				if (result == null) result = caseEventBNamed(eventBNamedCommentedDataElaborationElement);
				if (result == null) result = caseEventBElement(eventBNamedCommentedDataElaborationElement);
				if (result == null) result = caseEventBCommented(eventBNamedCommentedDataElaborationElement);
				if (result == null) result = caseEventBObject(eventBNamedCommentedDataElaborationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.EVENT_BNAMED_COMMENTED_RELATION_DATA_ELABORATION_ELEMENT: {
				EventBNamedCommentedRelationDataElaborationElement eventBNamedCommentedRelationDataElaborationElement = (EventBNamedCommentedRelationDataElaborationElement)theEObject;
				T result = caseEventBNamedCommentedRelationDataElaborationElement(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBNamedCommentedDataElaborationElement(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBRelationKind(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBNamedCommentedElement(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBDataElaboration(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBCommentedElement(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBNamed(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBElement(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBCommented(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = caseEventBObject(eventBNamedCommentedRelationDataElaborationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.TYPED_VARIABLE: {
				TypedVariable typedVariable = (TypedVariable)theEObject;
				T result = caseTypedVariable(typedVariable);
				if (result == null) result = caseVariable(typedVariable);
				if (result == null) result = caseType(typedVariable);
				if (result == null) result = caseValue(typedVariable);
				if (result == null) result = caseEventBNamedCommentedElement(typedVariable);
				if (result == null) result = caseEventBCommentedElement(typedVariable);
				if (result == null) result = caseEventBNamed(typedVariable);
				if (result == null) result = caseEventBElement(typedVariable);
				if (result == null) result = caseEventBCommented(typedVariable);
				if (result == null) result = caseEventBObject(typedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.TYPED_CONSTANT: {
				TypedConstant typedConstant = (TypedConstant)theEObject;
				T result = caseTypedConstant(typedConstant);
				if (result == null) result = caseConstant(typedConstant);
				if (result == null) result = caseType(typedConstant);
				if (result == null) result = caseValue(typedConstant);
				if (result == null) result = caseEventBNamedCommentedElement(typedConstant);
				if (result == null) result = caseEventBCommentedElement(typedConstant);
				if (result == null) result = caseEventBNamed(typedConstant);
				if (result == null) result = caseEventBElement(typedConstant);
				if (result == null) result = caseEventBCommented(typedConstant);
				if (result == null) result = caseEventBObject(typedConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreextensionPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedParameter(TypedParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BLabeled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BLabeled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBLabeled(EventBLabeled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BRelation Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BRelation Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBRelationKind(EventBRelationKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BData Elaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BData Elaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBDataElaboration(EventBDataElaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BEvent Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BEvent Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBEventGroup(EventBEventGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BCommented Labeled Event Group Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BCommented Labeled Event Group Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBCommentedLabeledEventGroupElement(EventBCommentedLabeledEventGroupElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BCommented Labeled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BCommented Labeled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBCommentedLabeledElement(EventBCommentedLabeledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed Commented Data Elaboration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed Commented Data Elaboration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamedCommentedDataElaborationElement(EventBNamedCommentedDataElaborationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed Commented Relation Data Elaboration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed Commented Relation Data Elaboration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamedCommentedRelationDataElaborationElement(EventBNamedCommentedRelationDataElaborationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedVariable(TypedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedConstant(TypedConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBObject(EventBObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBElement(EventBElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BCommented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BCommented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBCommented(EventBCommented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BCommented Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BCommented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBCommentedElement(EventBCommentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamed(EventBNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed Commented Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed Commented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamedCommentedElement(EventBNamedCommentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	//@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreextensionSwitch
