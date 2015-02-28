/**
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webapp.PageController#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see webapp.WebappPackage#getPageController()
 * @model
 * @generated
 */
public interface PageController extends Controller {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(View)
	 * @see webapp.WebappPackage#getPageController_Page()
	 * @model required="true"
	 * @generated
	 */
	View getPage();

	/**
	 * Sets the value of the '{@link webapp.PageController#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(View value);

} // PageController
