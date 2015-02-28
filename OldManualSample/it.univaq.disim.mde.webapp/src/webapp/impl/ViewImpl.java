/**
 */
package webapp.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import webapp.Data;
import webapp.Template;
import webapp.View;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.ViewImpl#getSubviews <em>Subviews</em>}</li>
 *   <li>{@link webapp.impl.ViewImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link webapp.impl.ViewImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends NamedElementImpl implements View {
	/**
	 * The cached value of the '{@link #getSubviews() <em>Subviews</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubviews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> subviews;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template template;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getSubviews() {
		if (subviews == null) {
			subviews = new EObjectContainmentEList<View>(View.class, this, WebappPackage.VIEW__SUBVIEWS);
		}
		return subviews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(Template newTemplate, NotificationChain msgs) {
		Template oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.VIEW__TEMPLATE, oldTemplate, newTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject)template).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.VIEW__TEMPLATE, null, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.VIEW__TEMPLATE, null, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.VIEW__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.VIEW__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.VIEW__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.VIEW__SUBVIEWS:
				return ((InternalEList<?>)getSubviews()).basicRemove(otherEnd, msgs);
			case WebappPackage.VIEW__TEMPLATE:
				return basicSetTemplate(null, msgs);
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
			case WebappPackage.VIEW__SUBVIEWS:
				return getSubviews();
			case WebappPackage.VIEW__TEMPLATE:
				return getTemplate();
			case WebappPackage.VIEW__DATA:
				if (resolve) return getData();
				return basicGetData();
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
			case WebappPackage.VIEW__SUBVIEWS:
				getSubviews().clear();
				getSubviews().addAll((Collection<? extends View>)newValue);
				return;
			case WebappPackage.VIEW__TEMPLATE:
				setTemplate((Template)newValue);
				return;
			case WebappPackage.VIEW__DATA:
				setData((Data)newValue);
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
			case WebappPackage.VIEW__SUBVIEWS:
				getSubviews().clear();
				return;
			case WebappPackage.VIEW__TEMPLATE:
				setTemplate((Template)null);
				return;
			case WebappPackage.VIEW__DATA:
				setData((Data)null);
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
			case WebappPackage.VIEW__SUBVIEWS:
				return subviews != null && !subviews.isEmpty();
			case WebappPackage.VIEW__TEMPLATE:
				return template != null;
			case WebappPackage.VIEW__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewImpl
