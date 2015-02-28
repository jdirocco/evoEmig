/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Model#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Data {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.ModelAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see webapp.WebappPackage#getModel_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelAttribute> getAttributes();

} // Model
