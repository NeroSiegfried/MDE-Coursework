/**
 * generated by Xtext 2.38.0
 */
package uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getMoveNumber <em>Move Number</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getColor1 <em>Color1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getWhiteMove <em>White Move</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getColor2 <em>Color2</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getBlackMove <em>Black Move</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMovePair()
 * @model
 * @generated
 */
public interface MovePair extends EObject
{
  /**
   * Returns the value of the '<em><b>Move Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move Number</em>' attribute.
   * @see #setMoveNumber(String)
   * @see uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMovePair_MoveNumber()
   * @model
   * @generated
   */
  String getMoveNumber();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getMoveNumber <em>Move Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Move Number</em>' attribute.
   * @see #getMoveNumber()
   * @generated
   */
  void setMoveNumber(String value);

  /**
   * Returns the value of the '<em><b>Color1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color1</em>' reference.
   * @see #setColor1(Player)
   * @see uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMovePair_Color1()
   * @model
   * @generated
   */
  Player getColor1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getColor1 <em>Color1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color1</em>' reference.
   * @see #getColor1()
   * @generated
   */
  void setColor1(Player value);

  /**
   * Returns the value of the '<em><b>White Move</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>White Move</em>' containment reference.
   * @see #setWhiteMove(AnyMove)
   * @see uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMovePair_WhiteMove()
   * @model containment="true"
   * @generated
   */
  AnyMove getWhiteMove();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getWhiteMove <em>White Move</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>White Move</em>' containment reference.
   * @see #getWhiteMove()
   * @generated
   */
  void setWhiteMove(AnyMove value);

  /**
   * Returns the value of the '<em><b>Color2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color2</em>' reference.
   * @see #setColor2(Player)
   * @see uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMovePair_Color2()
   * @model
   * @generated
   */
  Player getColor2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getColor2 <em>Color2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color2</em>' reference.
   * @see #getColor2()
   * @generated
   */
  void setColor2(Player value);

  /**
   * Returns the value of the '<em><b>Black Move</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Black Move</em>' containment reference.
   * @see #setBlackMove(AnyMove)
   * @see uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMovePair_BlackMove()
   * @model containment="true"
   * @generated
   */
  AnyMove getBlackMove();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.nerosiegfried.chessdsl.chessDSL.MovePair#getBlackMove <em>Black Move</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Black Move</em>' containment reference.
   * @see #getBlackMove()
   * @generated
   */
  void setBlackMove(AnyMove value);

} // MovePair
