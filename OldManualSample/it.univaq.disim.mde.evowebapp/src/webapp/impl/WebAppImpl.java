/**
 */
package webapp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webapp.Collection;
import webapp.Model;
import webapp.Router;
import webapp.WebApp;
import webapp.WebappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webapp.impl.WebAppImpl#getCollections <em>Collections</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getRouter <em>Router</em>}</li>
 *   <li>{@link webapp.impl.WebAppImpl#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebAppImpl extends NamedElementImpl implements WebApp {
	/**
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<Collection> collections;

	/**
	 * The cached value of the '{@link #getRouter() <em>Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouter()
	 * @generated
	 * @ordered
	 */
	protected Router router;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebappPackage.Literals.WEB_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collection> getCollections() {
		if (collections == null) {
			collections = new EObjectContainmentEList<Collection>(Collection.class, this, WebappPackage.WEB_APP__COLLECTIONS);
		}
		return collections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router getRouter() {
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouter(Router newRouter, NotificationChain msgs) {
		Router oldRouter = router;
		router = newRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__ROUTER, oldRouter, newRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouter(Router newRouter) {
		if (newRouter != router) {
			NotificationChain msgs = null;
			if (router != null)
				msgs = ((InternalEObject)router).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__ROUTER, null, msgs);
			if (newRouter != null)
				msgs = ((InternalEObject)newRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebappPackage.WEB_APP__ROUTER, null, msgs);
			msgs = basicSetRouter(newRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebappPackage.WEB_APP__ROUTER, newRouter, newRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<Model>(Model.class, this, WebappPackage.WEB_APP__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebappPackage.WEB_APP__COLLECTIONS:
				return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
			case WebappPackage.WEB_APP__ROUTER:
				return basicSetRouter(null, msgs);
			case WebappPackage.WEB_APP__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
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
			case WebappPackage.WEB_APP__COLLECTIONS:
				return getCollections();
			case WebappPackage.WEB_APP__ROUTER:
				return getRouter();
			case WebappPackage.WEB_APP__MODELS:
				return getModels();
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
			case WebappPackage.WEB_APP__COLLECTIONS:
				getCollections().clear();
				getCollections().addAll((java.util.Collection<? extends Collection>)newValue);
				return;
			case WebappPackage.WEB_APP__ROUTER:
				setRouter((Router)newValue);
				return;
			case WebappPackage.WEB_APP__MODELS:
				getModels().clear();
				getModels().addAll((java.util.Collection<? extends Model>)newValue);
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
			case WebappPackage.WEB_APP__COLLECTIONS:
				getCollections().clear();
				return;
			case WebappPackage.WEB_APP__ROUTER:
				setRouter((Router)null);
				return;
			case WebappPackage.WEB_APP__MODELS:
				getModels().clear();
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
			case WebappPackage.WEB_APP__COLLECTIONS:
				return collections != null && !collections.isEmpty();
			case WebappPackage.WEB_APP__ROUTER:
				return router != null;
			case WebappPackage.WEB_APP__MODELS:
				return models != null && !models.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WebAppImpl
