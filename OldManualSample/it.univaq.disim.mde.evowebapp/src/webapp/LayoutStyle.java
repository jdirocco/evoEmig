/**
 */
package webapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Layout Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage#getLayoutStyle()
 * @model
 * @generated
 */
public enum LayoutStyle implements Enumerator {
	/**
	 * The '<em><b>Vertical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL(0, "Vertical", "Vertical"),

	/**
	 * The '<em><b>Horizontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL(0, "Horizontal", "Horizontal"),

	/**
	 * The '<em><b>Grid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRID_VALUE
	 * @generated
	 * @ordered
	 */
	GRID(0, "Grid", "Grid");

	/**
	 * The '<em><b>Vertical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL
	 * @model name="Vertical"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_VALUE = 0;

	/**
	 * The '<em><b>Horizontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL
	 * @model name="Horizontal"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_VALUE = 0;

	/**
	 * The '<em><b>Grid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRID
	 * @model name="Grid"
	 * @generated
	 * @ordered
	 */
	public static final int GRID_VALUE = 0;

	/**
	 * An array of all the '<em><b>Layout Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LayoutStyle[] VALUES_ARRAY =
		new LayoutStyle[] {
			VERTICAL,
			HORIZONTAL,
			GRID,
		};

	/**
	 * A public read-only list of all the '<em><b>Layout Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LayoutStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Layout Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LayoutStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LayoutStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutStyle get(int value) {
		switch (value) {
			case VERTICAL_VALUE: return VERTICAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LayoutStyle(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LayoutStyle
