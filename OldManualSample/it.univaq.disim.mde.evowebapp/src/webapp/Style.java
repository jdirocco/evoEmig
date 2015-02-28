/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Style#getStyleRules <em>Style Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Style Rules</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Rules</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Rules</em>' attribute list.
	 * @see webapp.WebappPackage#getStyle_StyleRules()
	 * @model
	 * @generated
	 */
	EList<String> getStyleRules();

} // Style
