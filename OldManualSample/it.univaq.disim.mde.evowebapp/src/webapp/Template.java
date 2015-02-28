/**
 */
package webapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.Template#getStructure <em>Structure</em>}</li>
 *   <li>{@link webapp.Template#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' attribute.
	 * @see #setStructure(String)
	 * @see webapp.WebappPackage#getTemplate_Structure()
	 * @model required="true"
	 * @generated
	 */
	String getStructure();

	/**
	 * Sets the value of the '{@link webapp.Template#getStructure <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' attribute.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' reference.
	 * @see #setStyle(Style)
	 * @see webapp.WebappPackage#getTemplate_Style()
	 * @model
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '{@link webapp.Template#getStyle <em>Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);

} // Template
