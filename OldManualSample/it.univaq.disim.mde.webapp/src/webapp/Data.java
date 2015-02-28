/**
 */
package webapp;


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
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see webapp.WebappPackage#getData_Endpoint()
	 * @model
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link webapp.Data#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

} // Data
