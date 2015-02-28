/**
 */
package webapp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webapp.WebappFactory
 * @model kind="package"
 * @generated
 */
public interface WebappPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webapp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.disim.univaq.it/mde/evowebapp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webapp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebappPackage eINSTANCE = webapp.impl.WebappPackageImpl.init();

	/**
	 * The meta object id for the '{@link webapp.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.NamedElementImpl
	 * @see webapp.impl.WebappPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.WebAppImpl <em>Web App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.WebAppImpl
	 * @see webapp.impl.WebappPackageImpl#getWebApp()
	 * @generated
	 */
	int WEB_APP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__COLLECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__ROUTER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP__MODELS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Web App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Web App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.DataImpl
	 * @see webapp.impl.WebappPackageImpl#getData()
	 * @generated
	 */
	int DATA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ENDPOINT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ModelImpl
	 * @see webapp.impl.WebappPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ENDPOINT = DATA__ENDPOINT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ATTRIBUTES = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.CollectionImpl
	 * @see webapp.impl.WebappPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ENDPOINT = DATA__ENDPOINT;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__MODELS = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ViewImpl
	 * @see webapp.impl.WebappPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subviews</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SUBVIEWS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TEMPLATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.RouterImpl
	 * @see webapp.impl.WebappPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 6;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__BINDINGS = 0;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.TemplateImpl
	 * @see webapp.impl.WebappPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ModelAttributeImpl <em>Model Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ModelAttributeImpl
	 * @see webapp.impl.WebappPackageImpl#getModelAttribute()
	 * @generated
	 */
	int MODEL_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Model Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.RouterBindingImpl <em>Router Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.RouterBindingImpl
	 * @see webapp.impl.WebappPackageImpl#getRouterBinding()
	 * @generated
	 */
	int ROUTER_BINDING = 9;

	/**
	 * The feature id for the '<em><b>Request URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_BINDING__REQUEST_URL = 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_BINDING__CONTROLLER = 1;

	/**
	 * The number of structural features of the '<em>Router Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Router Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ControllerImpl
	 * @see webapp.impl.WebappPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.PageControllerImpl <em>Page Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.PageControllerImpl
	 * @see webapp.impl.WebappPackageImpl#getPageController()
	 * @generated
	 */
	int PAGE_CONTROLLER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTROLLER__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTROLLER__PAGE = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Page Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.ServiceControllerImpl <em>Service Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.ServiceControllerImpl
	 * @see webapp.impl.WebappPackageImpl#getServiceController()
	 * @generated
	 */
	int SERVICE_CONTROLLER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROLLER__NAME = CONTROLLER__NAME;

	/**
	 * The number of structural features of the '<em>Service Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.impl.StyleImpl
	 * @see webapp.impl.WebappPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Style Rules</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__STYLE_RULES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webapp.LayoutStyle <em>Layout Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webapp.LayoutStyle
	 * @see webapp.impl.WebappPackageImpl#getLayoutStyle()
	 * @generated
	 */
	int LAYOUT_STYLE = 14;


	/**
	 * Returns the meta object for class '{@link webapp.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see webapp.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link webapp.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webapp.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link webapp.WebApp <em>Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web App</em>'.
	 * @see webapp.WebApp
	 * @generated
	 */
	EClass getWebApp();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.WebApp#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see webapp.WebApp#getCollections()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Collections();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.WebApp#getRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Router</em>'.
	 * @see webapp.WebApp#getRouter()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Router();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.WebApp#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see webapp.WebApp#getModels()
	 * @see #getWebApp()
	 * @generated
	 */
	EReference getWebApp_Models();

	/**
	 * Returns the meta object for class '{@link webapp.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see webapp.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Model#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see webapp.Model#getAttributes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Attributes();

	/**
	 * Returns the meta object for class '{@link webapp.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see webapp.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Collection#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see webapp.Collection#getModels()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Models();

	/**
	 * Returns the meta object for class '{@link webapp.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see webapp.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute list '{@link webapp.Data#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Endpoint</em>'.
	 * @see webapp.Data#getEndpoint()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Endpoint();

	/**
	 * Returns the meta object for class '{@link webapp.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see webapp.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.View#getSubviews <em>Subviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subviews</em>'.
	 * @see webapp.View#getSubviews()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Subviews();

	/**
	 * Returns the meta object for the containment reference '{@link webapp.View#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see webapp.View#getTemplate()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Template();

	/**
	 * Returns the meta object for the reference '{@link webapp.View#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see webapp.View#getData()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Data();

	/**
	 * Returns the meta object for class '{@link webapp.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see webapp.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the containment reference list '{@link webapp.Router#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see webapp.Router#getBindings()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_Bindings();

	/**
	 * Returns the meta object for class '{@link webapp.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see webapp.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the attribute '{@link webapp.Template#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure</em>'.
	 * @see webapp.Template#getStructure()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Structure();

	/**
	 * Returns the meta object for the reference '{@link webapp.Template#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Style</em>'.
	 * @see webapp.Template#getStyle()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Style();

	/**
	 * Returns the meta object for class '{@link webapp.ModelAttribute <em>Model Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Attribute</em>'.
	 * @see webapp.ModelAttribute
	 * @generated
	 */
	EClass getModelAttribute();

	/**
	 * Returns the meta object for the attribute '{@link webapp.ModelAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webapp.ModelAttribute#getName()
	 * @see #getModelAttribute()
	 * @generated
	 */
	EAttribute getModelAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link webapp.ModelAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see webapp.ModelAttribute#getValue()
	 * @see #getModelAttribute()
	 * @generated
	 */
	EAttribute getModelAttribute_Value();

	/**
	 * Returns the meta object for class '{@link webapp.RouterBinding <em>Router Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Binding</em>'.
	 * @see webapp.RouterBinding
	 * @generated
	 */
	EClass getRouterBinding();

	/**
	 * Returns the meta object for the attribute '{@link webapp.RouterBinding#getRequestURL <em>Request URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request URL</em>'.
	 * @see webapp.RouterBinding#getRequestURL()
	 * @see #getRouterBinding()
	 * @generated
	 */
	EAttribute getRouterBinding_RequestURL();

	/**
	 * Returns the meta object for the reference '{@link webapp.RouterBinding#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see webapp.RouterBinding#getController()
	 * @see #getRouterBinding()
	 * @generated
	 */
	EReference getRouterBinding_Controller();

	/**
	 * Returns the meta object for class '{@link webapp.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see webapp.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for class '{@link webapp.PageController <em>Page Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Controller</em>'.
	 * @see webapp.PageController
	 * @generated
	 */
	EClass getPageController();

	/**
	 * Returns the meta object for the reference '{@link webapp.PageController#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see webapp.PageController#getPage()
	 * @see #getPageController()
	 * @generated
	 */
	EReference getPageController_Page();

	/**
	 * Returns the meta object for class '{@link webapp.ServiceController <em>Service Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Controller</em>'.
	 * @see webapp.ServiceController
	 * @generated
	 */
	EClass getServiceController();

	/**
	 * Returns the meta object for class '{@link webapp.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see webapp.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute list '{@link webapp.Style#getStyleRules <em>Style Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Rules</em>'.
	 * @see webapp.Style#getStyleRules()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_StyleRules();

	/**
	 * Returns the meta object for enum '{@link webapp.LayoutStyle <em>Layout Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Style</em>'.
	 * @see webapp.LayoutStyle
	 * @generated
	 */
	EEnum getLayoutStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebappFactory getWebappFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webapp.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.NamedElementImpl
		 * @see webapp.impl.WebappPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link webapp.impl.WebAppImpl <em>Web App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.WebAppImpl
		 * @see webapp.impl.WebappPackageImpl#getWebApp()
		 * @generated
		 */
		EClass WEB_APP = eINSTANCE.getWebApp();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__COLLECTIONS = eINSTANCE.getWebApp_Collections();

		/**
		 * The meta object literal for the '<em><b>Router</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__ROUTER = eINSTANCE.getWebApp_Router();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APP__MODELS = eINSTANCE.getWebApp_Models();

		/**
		 * The meta object literal for the '{@link webapp.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ModelImpl
		 * @see webapp.impl.WebappPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ATTRIBUTES = eINSTANCE.getModel_Attributes();

		/**
		 * The meta object literal for the '{@link webapp.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.CollectionImpl
		 * @see webapp.impl.WebappPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__MODELS = eINSTANCE.getCollection_Models();

		/**
		 * The meta object literal for the '{@link webapp.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.DataImpl
		 * @see webapp.impl.WebappPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ENDPOINT = eINSTANCE.getData_Endpoint();

		/**
		 * The meta object literal for the '{@link webapp.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ViewImpl
		 * @see webapp.impl.WebappPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Subviews</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__SUBVIEWS = eINSTANCE.getView_Subviews();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__TEMPLATE = eINSTANCE.getView_Template();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__DATA = eINSTANCE.getView_Data();

		/**
		 * The meta object literal for the '{@link webapp.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.RouterImpl
		 * @see webapp.impl.WebappPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__BINDINGS = eINSTANCE.getRouter_Bindings();

		/**
		 * The meta object literal for the '{@link webapp.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.TemplateImpl
		 * @see webapp.impl.WebappPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__STRUCTURE = eINSTANCE.getTemplate_Structure();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__STYLE = eINSTANCE.getTemplate_Style();

		/**
		 * The meta object literal for the '{@link webapp.impl.ModelAttributeImpl <em>Model Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ModelAttributeImpl
		 * @see webapp.impl.WebappPackageImpl#getModelAttribute()
		 * @generated
		 */
		EClass MODEL_ATTRIBUTE = eINSTANCE.getModelAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ATTRIBUTE__NAME = eINSTANCE.getModelAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ATTRIBUTE__VALUE = eINSTANCE.getModelAttribute_Value();

		/**
		 * The meta object literal for the '{@link webapp.impl.RouterBindingImpl <em>Router Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.RouterBindingImpl
		 * @see webapp.impl.WebappPackageImpl#getRouterBinding()
		 * @generated
		 */
		EClass ROUTER_BINDING = eINSTANCE.getRouterBinding();

		/**
		 * The meta object literal for the '<em><b>Request URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER_BINDING__REQUEST_URL = eINSTANCE.getRouterBinding_RequestURL();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_BINDING__CONTROLLER = eINSTANCE.getRouterBinding_Controller();

		/**
		 * The meta object literal for the '{@link webapp.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ControllerImpl
		 * @see webapp.impl.WebappPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '{@link webapp.impl.PageControllerImpl <em>Page Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.PageControllerImpl
		 * @see webapp.impl.WebappPackageImpl#getPageController()
		 * @generated
		 */
		EClass PAGE_CONTROLLER = eINSTANCE.getPageController();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTROLLER__PAGE = eINSTANCE.getPageController_Page();

		/**
		 * The meta object literal for the '{@link webapp.impl.ServiceControllerImpl <em>Service Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.ServiceControllerImpl
		 * @see webapp.impl.WebappPackageImpl#getServiceController()
		 * @generated
		 */
		EClass SERVICE_CONTROLLER = eINSTANCE.getServiceController();

		/**
		 * The meta object literal for the '{@link webapp.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.impl.StyleImpl
		 * @see webapp.impl.WebappPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Style Rules</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__STYLE_RULES = eINSTANCE.getStyle_StyleRules();

		/**
		 * The meta object literal for the '{@link webapp.LayoutStyle <em>Layout Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webapp.LayoutStyle
		 * @see webapp.impl.WebappPackageImpl#getLayoutStyle()
		 * @generated
		 */
		EEnum LAYOUT_STYLE = eINSTANCE.getLayoutStyle();

	}

} //WebappPackage
