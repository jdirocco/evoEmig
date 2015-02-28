/**
 */
package webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.RouterBinding#getRequestURL <em>Request URL</em>}</li>
 *   <li>{@link webapp.RouterBinding#getController <em>Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getRouterBinding()
 * @model
 * @generated
 */
public interface RouterBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Request URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request URL</em>' attribute.
	 * @see #setRequestURL(String)
	 * @see webapp.WebappPackage#getRouterBinding_RequestURL()
	 * @model required="true"
	 * @generated
	 */
	String getRequestURL();

	/**
	 * Sets the value of the '{@link webapp.RouterBinding#getRequestURL <em>Request URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request URL</em>' attribute.
	 * @see #getRequestURL()
	 * @generated
	 */
	void setRequestURL(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Controller)
	 * @see webapp.WebappPackage#getRouterBinding_Controller()
	 * @model required="true"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link webapp.RouterBinding#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // RouterBinding
