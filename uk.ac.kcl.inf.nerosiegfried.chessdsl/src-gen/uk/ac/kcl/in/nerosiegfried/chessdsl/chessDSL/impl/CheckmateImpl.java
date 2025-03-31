/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Checkmate;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.PlayerOrColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checkmate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl.CheckmateImpl#getPlayer1 <em>Player1</em>}</li>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl.CheckmateImpl#getPlayer2 <em>Player2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckmateImpl extends MinimalEObjectImpl.Container implements Checkmate
{
  /**
   * The cached value of the '{@link #getPlayer1() <em>Player1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayer1()
   * @generated
   * @ordered
   */
  protected PlayerOrColor player1;

  /**
   * The cached value of the '{@link #getPlayer2() <em>Player2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayer2()
   * @generated
   * @ordered
   */
  protected PlayerOrColor player2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckmateImpl()
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
    return ChessDSLPackage.Literals.CHECKMATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlayerOrColor getPlayer1()
  {
    return player1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlayer1(PlayerOrColor newPlayer1, NotificationChain msgs)
  {
    PlayerOrColor oldPlayer1 = player1;
    player1 = newPlayer1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessDSLPackage.CHECKMATE__PLAYER1, oldPlayer1, newPlayer1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPlayer1(PlayerOrColor newPlayer1)
  {
    if (newPlayer1 != player1)
    {
      NotificationChain msgs = null;
      if (player1 != null)
        msgs = ((InternalEObject)player1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.CHECKMATE__PLAYER1, null, msgs);
      if (newPlayer1 != null)
        msgs = ((InternalEObject)newPlayer1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.CHECKMATE__PLAYER1, null, msgs);
      msgs = basicSetPlayer1(newPlayer1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessDSLPackage.CHECKMATE__PLAYER1, newPlayer1, newPlayer1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlayerOrColor getPlayer2()
  {
    return player2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlayer2(PlayerOrColor newPlayer2, NotificationChain msgs)
  {
    PlayerOrColor oldPlayer2 = player2;
    player2 = newPlayer2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessDSLPackage.CHECKMATE__PLAYER2, oldPlayer2, newPlayer2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPlayer2(PlayerOrColor newPlayer2)
  {
    if (newPlayer2 != player2)
    {
      NotificationChain msgs = null;
      if (player2 != null)
        msgs = ((InternalEObject)player2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.CHECKMATE__PLAYER2, null, msgs);
      if (newPlayer2 != null)
        msgs = ((InternalEObject)newPlayer2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.CHECKMATE__PLAYER2, null, msgs);
      msgs = basicSetPlayer2(newPlayer2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessDSLPackage.CHECKMATE__PLAYER2, newPlayer2, newPlayer2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ChessDSLPackage.CHECKMATE__PLAYER1:
        return basicSetPlayer1(null, msgs);
      case ChessDSLPackage.CHECKMATE__PLAYER2:
        return basicSetPlayer2(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ChessDSLPackage.CHECKMATE__PLAYER1:
        return getPlayer1();
      case ChessDSLPackage.CHECKMATE__PLAYER2:
        return getPlayer2();
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
      case ChessDSLPackage.CHECKMATE__PLAYER1:
        setPlayer1((PlayerOrColor)newValue);
        return;
      case ChessDSLPackage.CHECKMATE__PLAYER2:
        setPlayer2((PlayerOrColor)newValue);
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
      case ChessDSLPackage.CHECKMATE__PLAYER1:
        setPlayer1((PlayerOrColor)null);
        return;
      case ChessDSLPackage.CHECKMATE__PLAYER2:
        setPlayer2((PlayerOrColor)null);
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
      case ChessDSLPackage.CHECKMATE__PLAYER1:
        return player1 != null;
      case ChessDSLPackage.CHECKMATE__PLAYER2:
        return player2 != null;
    }
    return super.eIsSet(featureID);
  }

} //CheckmateImpl
