/**
 */
package webapp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import webapp.PageController;
import webapp.View;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.PageControllerImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageControllerImpl extends ControllerImpl implements PageController {
	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected View page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.PAGE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getPage() {
		if (page != null && page.eIsProxy()) {
			InternalEObject oldPage = (InternalEObject)page;
			page = (View)eResolveProxy(oldPage);
			if (page != oldPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebappPackage.PAGE_CONTROLLER__PAGE, oldPage, page));
			}
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(View newPage) {
		View oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.PAGE_CONTROLLER__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebappPackage.PAGE_CONTROLLER__PAGE:
				if (resolve) return getPage();
				return basicGetPage();
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
			case WebappPackage.PAGE_CONTROLLER__PAGE:
				setPage((View)newValue);
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
			case WebappPackage.PAGE_CONTROLLER__PAGE:
				setPage((View)null);
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
			case WebappPackage.PAGE_CONTROLLER__PAGE:
				return page != null;
		}
		return super.eIsSet(featureID);
	}

} //PageControllerImpl
