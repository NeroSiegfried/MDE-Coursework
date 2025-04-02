/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.SANCastle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAN Castle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl.SANCastleImpl#getSide <em>Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SANCastleImpl extends MinimalEObjectImpl.Container implements SANCastle
{
  /**
   * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSide()
   * @generated
   * @ordered
   */
  protected static final String SIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSide()
   * @generated
   * @ordered
   */
  protected String side = SIDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SANCastleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ChessDSLPackage.Literals.SAN_CASTLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSide()
  {
    return side;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSide(String newSide)
  {
    String oldSide = side;
    side = newSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessDSLPackage.SAN_CASTLE__SIDE, oldSide, side));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ChessDSLPackage.SAN_CASTLE__SIDE:
        return getSide();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ChessDSLPackage.SAN_CASTLE__SIDE:
        setSide((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ChessDSLPackage.SAN_CASTLE__SIDE:
        setSide(SIDE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ChessDSLPackage.SAN_CASTLE__SIDE:
        return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (side: ");
    result.append(side);
    result.append(')');
    return result.toString();
  }

} //SANCastleImpl
