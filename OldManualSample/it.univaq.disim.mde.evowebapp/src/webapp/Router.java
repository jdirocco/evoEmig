/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Router#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getRouter()
 * @model
 * @generated
 */
public interface Router extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.RouterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see webapp.WebappPackage#getRouter_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<RouterBinding> getBindings();

} // Router
