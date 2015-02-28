/**
 */
package webapp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webapp.Controller;
import webapp.RouterBinding;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.RouterBindingImpl#getRequestURL <em>Request URL</em>}</li>
 *   <li>{@link webapp.impl.RouterBindingImpl#getController <em>Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouterBindingImpl extends MinimalEObjectImpl.Container implements RouterBinding {
	/**
	 * The default value of the '{@link #getRequestURL() <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestURL()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestURL() <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestURL()
	 * @generated
	 * @ordered
	 */
	protected String requestURL = REQUEST_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected Controller controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouterBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.ROUTER_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestURL() {
		return requestURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestURL(String newRequestURL) {
		String oldRequestURL = requestURL;
		requestURL = newRequestURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.ROUTER_BINDING__REQUEST_URL, oldRequestURL, requestURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject)controller;
			controller = (Controller)eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.ROUTER_BINDING__CONTROLLER, oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(Controller newController) {
		Controller oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.ROUTER_BINDING__CONTROLLER, oldController, controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebappPackage.ROUTER_BINDING__REQUEST_URL:
				return getRequestURL();
			case WebappPackage.ROUTER_BINDING__CONTROLLER:
				if (resolve) return getController();
				return basicGetController();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebappPackage.ROUTER_BINDING__REQUEST_URL:
				setRequestURL((String)newValue);
				return;
			case WebappPackage.ROUTER_BINDING__CONTROLLER:
				setController((Controller)newValue);
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
			case WebappPackage.ROUTER_BINDING__REQUEST_URL:
				setRequestURL(REQUEST_URL_EDEFAULT);
				return;
			case WebappPackage.ROUTER_BINDING__CONTROLLER:
				setController((Controller)null);
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
			case WebappPackage.ROUTER_BINDING__REQUEST_URL:
				return REQUEST_URL_EDEFAULT == null ? requestURL != null : !REQUEST_URL_EDEFAULT.equals(requestURL);
			case WebappPackage.ROUTER_BINDING__CONTROLLER:
				return controller != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (requestURL: ");
		result.append(requestURL);
		result.append(')');
		return result.toString();
	}

} //RouterBindingImpl
