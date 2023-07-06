/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime;
import de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition;
import de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime;
import de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl#getSpeedOverPosition <em>Speed Over Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl#getSpeedOverTime <em>Speed Over Time</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl#getPositionOverTime <em>Position Over Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrajectoryImpl extends MinimalEObjectImpl.Container implements Trajectory {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

	/**
	 * The cached value of the '{@link #getSpeedOverPosition() <em>Speed Over Position</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOverPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeedOverPosition> speedOverPosition;

	/**
	 * The cached value of the '{@link #getSpeedOverTime() <em>Speed Over Time</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOverTime()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeedOverTime> speedOverTime;

	/**
	 * The cached value of the '{@link #getPositionOverTime() <em>Position Over Time</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOverTime()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionOverTime> positionOverTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrajectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.TRAJECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TRAJECTORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getVehicle() {
		if (vehicle != null && ((EObject)vehicle).eIsProxy()) {
			InternalEObject oldVehicle = vehicle;
			vehicle = (Vehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DasexchangePackage.TRAJECTORY__VEHICLE, oldVehicle, vehicle));
			}
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		Vehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TRAJECTORY__VEHICLE, oldVehicle, vehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpeedOverPosition> getSpeedOverPosition() {
		if (speedOverPosition == null) {
			speedOverPosition = new EObjectResolvingEList<SpeedOverPosition>(SpeedOverPosition.class, this, DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION);
		}
		return speedOverPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpeedOverTime> getSpeedOverTime() {
		if (speedOverTime == null) {
			speedOverTime = new EObjectResolvingEList<SpeedOverTime>(SpeedOverTime.class, this, DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME);
		}
		return speedOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositionOverTime> getPositionOverTime() {
		if (positionOverTime == null) {
			positionOverTime = new EObjectResolvingEList<PositionOverTime>(PositionOverTime.class, this, DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME);
		}
		return positionOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.TRAJECTORY__ID:
				return getId();
			case DasexchangePackage.TRAJECTORY__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				return getSpeedOverPosition();
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				return getSpeedOverTime();
			case DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME:
				return getPositionOverTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DasexchangePackage.TRAJECTORY__ID:
				setId((String)newValue);
				return;
			case DasexchangePackage.TRAJECTORY__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				getSpeedOverPosition().clear();
				getSpeedOverPosition().addAll((Collection<? extends SpeedOverPosition>)newValue);
				return;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				getSpeedOverTime().clear();
				getSpeedOverTime().addAll((Collection<? extends SpeedOverTime>)newValue);
				return;
			case DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME:
				getPositionOverTime().clear();
				getPositionOverTime().addAll((Collection<? extends PositionOverTime>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DasexchangePackage.TRAJECTORY__ID:
				setId(ID_EDEFAULT);
				return;
			case DasexchangePackage.TRAJECTORY__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				getSpeedOverPosition().clear();
				return;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				getSpeedOverTime().clear();
				return;
			case DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME:
				getPositionOverTime().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DasexchangePackage.TRAJECTORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DasexchangePackage.TRAJECTORY__VEHICLE:
				return vehicle != null;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				return speedOverPosition != null && !speedOverPosition.isEmpty();
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				return speedOverTime != null && !speedOverTime.isEmpty();
			case DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME:
				return positionOverTime != null && !positionOverTime.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TrajectoryImpl
