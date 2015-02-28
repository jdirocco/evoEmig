/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.WebApp#getCollections <em>Collections</em>}</li>
 *   <li>{@link webapp.WebApp#getRouter <em>Router</em>}</li>
 *   <li>{@link webapp.WebApp#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getWebApp()
 * @model
 * @generated
 */
public interface WebApp extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see webapp.WebappPackage#getWebApp_Collections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collection> getCollections();

	/**
	 * Returns the value of the '<em><b>Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router</em>' containment reference.
	 * @see #setRouter(Router)
	 * @see webapp.WebappPackage#getWebApp_Router()
	 * @model containment="true"
	 * @generated
	 */
	Router getRouter();

	/**
	 * Sets the value of the '{@link webapp.WebApp#getRouter <em>Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router</em>' containment reference.
	 * @see #getRouter()
	 * @generated
	 */
	void setRouter(Router value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see webapp.WebappPackage#getWebApp_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

} // WebApp
