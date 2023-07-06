/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.Position;
import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed Over Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse, Geschwindigkeit über Position
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getSpeed <em>Speed</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverPosition()
 * @model
 * @generated
 */
public interface SpeedOverPosition extends EObject {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' reference.
	 * @see #setSpeed(ValueItem)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverPosition_Speed()
	 * @model
	 * @generated
	 */
	ValueItem getSpeed();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getSpeed <em>Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(ValueItem value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverPosition_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // SpeedOverPosition
