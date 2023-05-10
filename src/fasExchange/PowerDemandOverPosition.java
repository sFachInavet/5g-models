/**
 */
package fasExchange;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import utils.Position;
import utils.ValueItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Demand Over Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse
 * Leistungsbedarf auf einer Position
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fasExchange.PowerDemandOverPosition#getPowerPrognosis <em>Power Prognosis</em>}</li>
 *   <li>{@link fasExchange.PowerDemandOverPosition#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerDemandOverPosition extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getPowerPrognosis() <em>Power Prognosis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerPrognosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueItem> powerPrognosis;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerDemandOverPosition() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FasExchangePackage.Literals.POWER_DEMAND_OVER_POSITION;
	}

	/**
	 * Returns the value of the '<em><b>Power Prognosis</b></em>' reference list.
	 * The list contents are of type {@link utils.ValueItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Leistungsbedarfsprognosen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Prognosis</em>' reference list.
	 * @generated
	 */
	public List<ValueItem> getPowerPrognosis() {
		if (powerPrognosis == null) {
			powerPrognosis = new BasicInternalEList<ValueItem>(ValueItem.class);
		}
		return powerPrognosis;
	}

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference list.
	 * The list contents are of type {@link utils.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positionen für Leistungsbedarf
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' reference list.
	 * @generated
	 */
	public List<Position> getPosition() {
		if (position == null) {
			position = new BasicInternalEList<Position>(Position.class);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS:
				return getPowerPrognosis();
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION__POSITION:
				return getPosition();
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
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS:
				getPowerPrognosis().clear();
				getPowerPrognosis().addAll((Collection<? extends ValueItem>)newValue);
				return;
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends Position>)newValue);
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
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS:
				getPowerPrognosis().clear();
				return;
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION__POSITION:
				getPosition().clear();
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
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS:
				return powerPrognosis != null && !powerPrognosis.isEmpty();
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION__POSITION:
				return position != null && !position.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PowerDemandOverPosition
