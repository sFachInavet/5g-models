/**
 */
package lm_interface;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import utils.Position;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis For LM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hauptklasse für Interface FAS -> LM
 * presentPosition -> aktuelle Position
 * timestamp -> Zeitpunkt der Datenerstellung
 * presentElectricalLoad -> laut FAS-Berechnung notwendige Leistung für Antrieb und Nebenverbraucher
 * prognosisForPositionAndElectricalLoad ->Liste der Prognose-Positionen und Lastbedarfe
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lm_interface.PrognosisForLM#getPresentPosition <em>Present Position</em>}</li>
 *   <li>{@link lm_interface.PrognosisForLM#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link lm_interface.PrognosisForLM#getPresentElectricalLoad <em>Present Electrical Load</em>}</li>
 *   <li>{@link lm_interface.PrognosisForLM#getPrognosisForPositionAndElectricalLoad <em>Prognosis For Position And Electrical Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisForLM extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getPresentPosition() <em>Present Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentPosition()
	 * @generated
	 * @ordered
	 */
	protected Position presentPosition;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresentElectricalLoad() <em>Present Electrical Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentElectricalLoad()
	 * @generated
	 * @ordered
	 */
	protected ElectricalLoad presentElectricalLoad;

	/**
	 * The cached value of the '{@link #getPrognosisForPositionAndElectricalLoad() <em>Prognosis For Position And Electrical Load</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisForPositionAndElectricalLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<PrognosisPositionAndElectricalLoad> prognosisForPositionAndElectricalLoad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisForLM() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lm_interfacePackage.Literals.PROGNOSIS_FOR_LM;
	}

	/**
	 * Returns the value of the '<em><b>Present Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Present Position</em>' reference.
	 * @see #setPresentPosition(Position)
	 * @generated
	 */
	public Position getPresentPosition() {
		if (presentPosition != null && ((EObject)presentPosition).eIsProxy()) {
			InternalEObject oldPresentPosition = presentPosition;
			presentPosition = (Position)eResolveProxy(oldPresentPosition);
			if (presentPosition != oldPresentPosition) {
			}
		}
		return presentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPresentPosition() {
		return presentPosition;
	}

	/**
	 * Sets the value of the '{@link lm_interface.PrognosisForLM#getPresentPosition <em>Present Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPresentPosition the new value of the '<em>Present Position</em>' reference.
	 * @see #getPresentPosition()
	 * @generated
	 */
	public void setPresentPosition(Position newPresentPosition) {
		presentPosition = newPresentPosition;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link lm_interface.PrognosisForLM#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimestamp the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	public void setTimestamp(ZonedDateTime newTimestamp) {
		timestamp = newTimestamp;
	}

	/**
	 * Returns the value of the '<em><b>Present Electrical Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Present Electrical Load</em>' reference.
	 * @see #setPresentElectricalLoad(ElectricalLoad)
	 * @generated
	 */
	public ElectricalLoad getPresentElectricalLoad() {
		if (presentElectricalLoad != null && ((EObject)presentElectricalLoad).eIsProxy()) {
			InternalEObject oldPresentElectricalLoad = presentElectricalLoad;
			presentElectricalLoad = (ElectricalLoad)eResolveProxy(oldPresentElectricalLoad);
			if (presentElectricalLoad != oldPresentElectricalLoad) {
			}
		}
		return presentElectricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad basicGetPresentElectricalLoad() {
		return presentElectricalLoad;
	}

	/**
	 * Sets the value of the '{@link lm_interface.PrognosisForLM#getPresentElectricalLoad <em>Present Electrical Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPresentElectricalLoad the new value of the '<em>Present Electrical Load</em>' reference.
	 * @see #getPresentElectricalLoad()
	 * @generated
	 */
	public void setPresentElectricalLoad(ElectricalLoad newPresentElectricalLoad) {
		presentElectricalLoad = newPresentElectricalLoad;
	}

	/**
	 * Returns the value of the '<em><b>Prognosis For Position And Electrical Load</b></em>' reference list.
	 * The list contents are of type {@link lm_interface.PrognosisPositionAndElectricalLoad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis For Position And Electrical Load</em>' reference list.
	 * @generated
	 */
	public EList<PrognosisPositionAndElectricalLoad> getPrognosisForPositionAndElectricalLoad() {
		if (prognosisForPositionAndElectricalLoad == null) {
			prognosisForPositionAndElectricalLoad = new BasicInternalEList<PrognosisPositionAndElectricalLoad>(PrognosisPositionAndElectricalLoad.class);
		}
		return prognosisForPositionAndElectricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				if (resolve) return getPresentPosition();
				return basicGetPresentPosition();
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				return getTimestamp();
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				if (resolve) return getPresentElectricalLoad();
				return basicGetPresentElectricalLoad();
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				return getPrognosisForPositionAndElectricalLoad();
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
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				setPresentPosition((Position)newValue);
				return;
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				setPresentElectricalLoad((ElectricalLoad)newValue);
				return;
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				getPrognosisForPositionAndElectricalLoad().clear();
				getPrognosisForPositionAndElectricalLoad().addAll((Collection<? extends PrognosisPositionAndElectricalLoad>)newValue);
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
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				setPresentPosition((Position)null);
				return;
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				setPresentElectricalLoad((ElectricalLoad)null);
				return;
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				getPrognosisForPositionAndElectricalLoad().clear();
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
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				return presentPosition != null;
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				return presentElectricalLoad != null;
			case Lm_interfacePackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				return prognosisForPositionAndElectricalLoad != null && !prognosisForPositionAndElectricalLoad.isEmpty();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} // PrognosisForLM
