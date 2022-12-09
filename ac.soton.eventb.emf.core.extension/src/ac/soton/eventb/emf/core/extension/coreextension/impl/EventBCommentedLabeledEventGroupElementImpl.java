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
package ac.soton.eventb.emf.core.extension.coreextension.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Witness;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.EventBCommentedLabeledEventGroupElement;
import ac.soton.eventb.emf.core.extension.coreextension.EventBEventGroup;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event BCommented Labeled Event Group Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl#getElaborates <em>Elaborates</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl#isExtended <em>Extended</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl#getWitnesses <em>Witnesses</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.core.extension.coreextension.impl.EventBCommentedLabeledEventGroupElementImpl#getRefines <em>Refines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventBCommentedLabeledEventGroupElementImpl extends EventBCommentedLabeledElementImpl implements EventBCommentedLabeledEventGroupElement {
	/**
	 * The cached value of the '{@link #getElaborates() <em>Elaborates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElaborates()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> elaborates;

	/**
	 * The default value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected boolean extended = EXTENDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedParameter> parameters;

	/**
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> guards;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getWitnesses() <em>Witnesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see #getWitnesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Witness> witnesses;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EventBEventGroup refines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBCommentedLabeledEventGroupElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreextensionPackage.Literals.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getElaborates() {
		if (elaborates == null) {
			elaborates = new EObjectResolvingEList<Event>(Event.class, this, CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ELABORATES);
		}
		return elaborates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtended() {
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * When extend is set true, any local guards that are also present in the extended guards are removed
	 * When extend is set false, all the extended guards are copied into the local guards
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setExtended(boolean newExtended) {
		boolean oldExtended = extended;
		EList<TypedParameter> localParameters = getParameters();
		EList<Guard> localGuards = getGuards();
		EList<Action> localActions = getActions();
		//n.b. must be after setting extended or before clearing extended for getExtendedGuards() to work correctly
		if (newExtended==true) {
			
			extended = newExtended;
			
			List<TypedParameter> repeatedParameters = new ArrayList<TypedParameter>();
			for (TypedParameter p : localParameters) {
				for (TypedParameter ep : getExtendedParameters()) {
					if (p.getName().trim().equals(ep.getName().trim())) {
						repeatedParameters.add(p);
					}
				}
			}
			localParameters.removeAll(repeatedParameters);
			
			List<Guard> repeatedGuards = new ArrayList<Guard>();
			for (Guard g : localGuards) {
				for (Guard eg : getExtendedGuards()) {
					if (g.getPredicate().trim().equals(eg.getPredicate().trim())) {
						repeatedGuards.add(g);
					}
				}
			}
			localGuards.removeAll(repeatedGuards);
			
			List<Action> repeatedActions = new ArrayList<Action>();
			for (Action g : localActions) {
				for (Action eg : getExtendedActions()) {
					if (g.getAction().trim().equals(eg.getAction().trim())) {
						repeatedActions.add(g);
					}
				}
			}
			localActions.removeAll(repeatedActions);
			
		}else {
			localParameters.addAll(EcoreUtil.copyAll(getExtendedParameters()));
			localGuards.addAll(EcoreUtil.copyAll(getExtendedGuards()));
			localActions.addAll(EcoreUtil.copyAll(getExtendedActions()));
			extended = newExtended;
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENDED, oldExtended, extended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<TypedParameter>(TypedParameter.class, this, CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getGuards() {
		if (guards == null) {
			guards = new EObjectContainmentEList<Guard>(Guard.class, this, CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Witness> getWitnesses() {
		if (witnesses == null) {
			witnesses = new EObjectContainmentEList<Witness>(Witness.class, this, CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES);
		}
		return witnesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBEventGroup getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (EventBEventGroup)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBEventGroup basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(EventBEventGroup newRefines) {
		EventBEventGroup oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFINES, oldRefines, refines));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedParameter> getExtendedParameters() {
				List<TypedParameter> ret = new  ArrayList<TypedParameter>();
				if (this.isExtended() && this.getRefines()!=null && this.getRefines()!=this) {
					ret.addAll(this.getRefines().getParameters());
					ret.addAll(this.getRefines().getExtendedParameters());
				}
				return new BasicEList.UnmodifiableEList<TypedParameter>(ret.size(),ret.toArray()) ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getExtendedGuards() {
				List<Guard> ret = new  ArrayList<Guard>();
				if (this.isExtended() && this.getRefines()!=null && this.getRefines()!=this) {
					ret.addAll(this.getRefines().getGuards());
					ret.addAll(this.getRefines().getExtendedGuards());
				}
				return new BasicEList.UnmodifiableEList<Guard>(ret.size(),ret.toArray()) ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getExtendedActions() {
				List<Action> ret = new  ArrayList<Action>();
				if (this.isExtended() && this.getRefines()!=null && this.getRefines()!=this) {
					ret.addAll(this.getRefines().getActions());
					ret.addAll(this.getRefines().getExtendedActions());
				}
				return new BasicEList.UnmodifiableEList<Action>(ret.size(),ret.toArray()) ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES:
				return ((InternalEList<?>)getWitnesses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ELABORATES:
				return getElaborates();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENDED:
				return isExtended();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS:
				return getParameters();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS:
				return getGuards();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS:
				return getActions();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES:
				return getWitnesses();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ELABORATES:
				getElaborates().clear();
				getElaborates().addAll((Collection<? extends Event>)newValue);
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENDED:
				setExtended((Boolean)newValue);
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends TypedParameter>)newValue);
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends Guard>)newValue);
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES:
				getWitnesses().clear();
				getWitnesses().addAll((Collection<? extends Witness>)newValue);
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFINES:
				setRefines((EventBEventGroup)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ELABORATES:
				getElaborates().clear();
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENDED:
				setExtended(EXTENDED_EDEFAULT);
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS:
				getParameters().clear();
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS:
				getGuards().clear();
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS:
				getActions().clear();
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES:
				getWitnesses().clear();
				return;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFINES:
				setRefines((EventBEventGroup)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ELABORATES:
				return elaborates != null && !elaborates.isEmpty();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENDED:
				return extended != EXTENDED_EDEFAULT;
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS:
				return guards != null && !guards.isEmpty();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES:
				return witnesses != null && !witnesses.isEmpty();
			case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFINES:
				return refines != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EventBEventGroup.class) {
			switch (derivedFeatureID) {
				case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ELABORATES: return CoreextensionPackage.EVENT_BEVENT_GROUP__ELABORATES;
				case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENDED: return CoreextensionPackage.EVENT_BEVENT_GROUP__EXTENDED;
				case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS: return CoreextensionPackage.EVENT_BEVENT_GROUP__PARAMETERS;
				case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS: return CoreextensionPackage.EVENT_BEVENT_GROUP__GUARDS;
				case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS: return CoreextensionPackage.EVENT_BEVENT_GROUP__ACTIONS;
				case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES: return CoreextensionPackage.EVENT_BEVENT_GROUP__WITNESSES;
				case CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFINES: return CoreextensionPackage.EVENT_BEVENT_GROUP__REFINES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EventBEventGroup.class) {
			switch (baseFeatureID) {
				case CoreextensionPackage.EVENT_BEVENT_GROUP__ELABORATES: return CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ELABORATES;
				case CoreextensionPackage.EVENT_BEVENT_GROUP__EXTENDED: return CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__EXTENDED;
				case CoreextensionPackage.EVENT_BEVENT_GROUP__PARAMETERS: return CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__PARAMETERS;
				case CoreextensionPackage.EVENT_BEVENT_GROUP__GUARDS: return CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__GUARDS;
				case CoreextensionPackage.EVENT_BEVENT_GROUP__ACTIONS: return CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__ACTIONS;
				case CoreextensionPackage.EVENT_BEVENT_GROUP__WITNESSES: return CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__WITNESSES;
				case CoreextensionPackage.EVENT_BEVENT_GROUP__REFINES: return CoreextensionPackage.EVENT_BCOMMENTED_LABELED_EVENT_GROUP_ELEMENT__REFINES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extended: ");
		result.append(extended);
		result.append(')');
		return result.toString();
	}
	
	/* 
	 * Overriden to fix problem with notification of label change on EReference 'elaborates' change.
	 * A notification that the label has changed will be sent whenever the elaborates property is changed
	 */
	@Override
	public void eNotify(Notification notification) {
		super.eNotify(notification);
		int type = notification.getEventType();
		Object feature = notification.getFeature();
		if (	CoreextensionPackage.Literals.EVENT_BEVENT_GROUP__ELABORATES.equals(feature)
				&& (type == Notification.ADD || type == Notification.ADD_MANY
						|| type == Notification.REMOVE || type == Notification.REMOVE_MANY))
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, CoreextensionPackage.Literals.EVENT_BLABELED__LABEL, notification.getOldValue(), notification.getNewValue()));
	}

} //EventBCommentedLabeledEventGroupElementImpl
