/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Collection#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends Data {
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
	 * @see webapp.WebappPackage#getCollection_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

} // Collection
