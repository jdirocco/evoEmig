/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Data#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getData()
 * @model
 * @generated
 */
public interface Data extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute list.
	 * @see webapp.WebappPackage#getData_Endpoint()
	 * @model
	 * @generated
	 */
	EList<String> getEndpoint();

} // Data
