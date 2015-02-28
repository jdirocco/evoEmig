/**
 */
package webapp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.View#getSubviews <em>Subviews</em>}</li>
 *   <li>{@link webapp.View#getTemplate <em>Template</em>}</li>
 *   <li>{@link webapp.View#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getView()
 * @model
 * @generated
 */
public interface View extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subviews</b></em>' containment reference list.
	 * The list contents are of type {@link webapp.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subviews</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subviews</em>' containment reference list.
	 * @see webapp.WebappPackage#getView_Subviews()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getSubviews();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(Template)
	 * @see webapp.WebappPackage#getView_Template()
	 * @model containment="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link webapp.View#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see webapp.WebappPackage#getView_Data()
	 * @model
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link webapp.View#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // View
