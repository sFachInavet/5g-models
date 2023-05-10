/**
 */
package de.inavet.mqttadapter.datamodels.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Vehicle Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see utils.UtilsPackage#getVehicleType()
 * @generated
 */
public enum VehicleType implements Enumerator {
	/**
	 * The '<em><b>Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAM(0, "tram", "tram"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(1, "bus", "bus"),

	/**
	 * The '<em><b>Emergency Vehicle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_VEHICLE_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY_VEHICLE(2, "emergencyVehicle", "emergencyVehicle"),

	/**
	 * The '<em><b>Car</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(3, "car", "car"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other");

	/**
	 * The '<em><b>Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM
	 * @generated
	 * @ordered
	 */
	public static final int TRAM_VALUE = 0;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 1;

	/**
	 * The '<em><b>Emergency Vehicle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_VEHICLE
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_VEHICLE_VALUE = 2;

	/**
	 * The '<em><b>Car</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Vehicle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VehicleType[] VALUES_ARRAY =
		new VehicleType[] {
			TRAM,
			BUS,
			EMERGENCY_VEHICLE,
			CAR,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Vehicle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VehicleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType get(int value) {
		switch (value) {
			case TRAM_VALUE: return TRAM;
			case BUS_VALUE: return BUS;
			case EMERGENCY_VEHICLE_VALUE: return EMERGENCY_VEHICLE;
			case CAR_VALUE: return CAR;
			case OTHER_VALUE: return OTHER;
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
	private VehicleType(int value, String name, String literal) {
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
	
} //VehicleType
