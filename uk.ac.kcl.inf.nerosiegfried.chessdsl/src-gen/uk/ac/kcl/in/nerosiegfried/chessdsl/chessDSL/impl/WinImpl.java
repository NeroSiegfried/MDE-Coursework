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
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Resign;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.TimeUp;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Win;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl.WinImpl#getTime <em>Time</em>}</li>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl.WinImpl#getResign <em>Resign</em>}</li>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl.WinImpl#getMate <em>Mate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinImpl extends MinimalEObjectImpl.Container implements Win
{
  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected TimeUp time;

  /**
   * The cached value of the '{@link #getResign() <em>Resign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResign()
   * @generated
   * @ordered
   */
  protected Resign resign;

  /**
   * The cached value of the '{@link #getMate() <em>Mate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMate()
   * @generated
   * @ordered
   */
  protected Checkmate mate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WinImpl()
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
    return ChessDSLPackage.Literals.WIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUp getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(TimeUp newTime, NotificationChain msgs)
  {
    TimeUp oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessDSLPackage.WIN__TIME, oldTime, newTime);
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
  public void setTime(TimeUp newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.WIN__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.WIN__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessDSLPackage.WIN__TIME, newTime, newTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Resign getResign()
  {
    return resign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResign(Resign newResign, NotificationChain msgs)
  {
    Resign oldResign = resign;
    resign = newResign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessDSLPackage.WIN__RESIGN, oldResign, newResign);
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
  public void setResign(Resign newResign)
  {
    if (newResign != resign)
    {
      NotificationChain msgs = null;
      if (resign != null)
        msgs = ((InternalEObject)resign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.WIN__RESIGN, null, msgs);
      if (newResign != null)
        msgs = ((InternalEObject)newResign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.WIN__RESIGN, null, msgs);
      msgs = basicSetResign(newResign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessDSLPackage.WIN__RESIGN, newResign, newResign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Checkmate getMate()
  {
    return mate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMate(Checkmate newMate, NotificationChain msgs)
  {
    Checkmate oldMate = mate;
    mate = newMate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessDSLPackage.WIN__MATE, oldMate, newMate);
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
  public void setMate(Checkmate newMate)
  {
    if (newMate != mate)
    {
      NotificationChain msgs = null;
      if (mate != null)
        msgs = ((InternalEObject)mate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.WIN__MATE, null, msgs);
      if (newMate != null)
        msgs = ((InternalEObject)newMate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessDSLPackage.WIN__MATE, null, msgs);
      msgs = basicSetMate(newMate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessDSLPackage.WIN__MATE, newMate, newMate));
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
      case ChessDSLPackage.WIN__TIME:
        return basicSetTime(null, msgs);
      case ChessDSLPackage.WIN__RESIGN:
        return basicSetResign(null, msgs);
      case ChessDSLPackage.WIN__MATE:
        return basicSetMate(null, msgs);
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
      case ChessDSLPackage.WIN__TIME:
        return getTime();
      case ChessDSLPackage.WIN__RESIGN:
        return getResign();
      case ChessDSLPackage.WIN__MATE:
        return getMate();
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
      case ChessDSLPackage.WIN__TIME:
        setTime((TimeUp)newValue);
        return;
      case ChessDSLPackage.WIN__RESIGN:
        setResign((Resign)newValue);
        return;
      case ChessDSLPackage.WIN__MATE:
        setMate((Checkmate)newValue);
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
      case ChessDSLPackage.WIN__TIME:
        setTime((TimeUp)null);
        return;
      case ChessDSLPackage.WIN__RESIGN:
        setResign((Resign)null);
        return;
      case ChessDSLPackage.WIN__MATE:
        setMate((Checkmate)null);
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
      case ChessDSLPackage.WIN__TIME:
        return time != null;
      case ChessDSLPackage.WIN__RESIGN:
        return resign != null;
      case ChessDSLPackage.WIN__MATE:
        return mate != null;
    }
    return super.eIsSet(featureID);
  }

} //WinImpl
