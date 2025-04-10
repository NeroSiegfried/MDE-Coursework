/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Square;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl.SquareImpl#getSquare <em>Square</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends MinimalEObjectImpl.Container implements Square
{
  /**
   * The default value of the '{@link #getSquare() <em>Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquare()
   * @generated
   * @ordered
   */
  protected static final String SQUARE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSquare() <em>Square</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSquare()
   * @generated
   * @ordered
   */
  protected String square = SQUARE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SquareImpl()
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
    return ChessDSLPackage.Literals.SQUARE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSquare()
  {
    return square;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSquare(String newSquare)
  {
    String oldSquare = square;
    square = newSquare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessDSLPackage.SQUARE__SQUARE, oldSquare, square));
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
      case ChessDSLPackage.SQUARE__SQUARE:
        return getSquare();
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
      case ChessDSLPackage.SQUARE__SQUARE:
        setSquare((String)newValue);
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
      case ChessDSLPackage.SQUARE__SQUARE:
        setSquare(SQUARE_EDEFAULT);
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
      case ChessDSLPackage.SQUARE__SQUARE:
        return SQUARE_EDEFAULT == null ? square != null : !SQUARE_EDEFAULT.equals(square);
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
    result.append(" (square: ");
    result.append(square);
    result.append(')');
    return result.toString();
  }

} //SquareImpl
