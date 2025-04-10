/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Draw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Draw#getPlayer1 <em>Player1</em>}</li>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Draw#getPlayer2 <em>Player2</em>}</li>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Draw#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getDraw()
 * @model
 * @generated
 */
public interface Draw extends EObject
{
  /**
   * Returns the value of the '<em><b>Player1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Player1</em>' containment reference.
   * @see #setPlayer1(PlayerOrColor)
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getDraw_Player1()
   * @model containment="true"
   * @generated
   */
  PlayerOrColor getPlayer1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Draw#getPlayer1 <em>Player1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Player1</em>' containment reference.
   * @see #getPlayer1()
   * @generated
   */
  void setPlayer1(PlayerOrColor value);

  /**
   * Returns the value of the '<em><b>Player2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Player2</em>' containment reference.
   * @see #setPlayer2(PlayerOrColor)
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getDraw_Player2()
   * @model containment="true"
   * @generated
   */
  PlayerOrColor getPlayer2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Draw#getPlayer2 <em>Player2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Player2</em>' containment reference.
   * @see #getPlayer2()
   * @generated
   */
  void setPlayer2(PlayerOrColor value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference.
   * @see #setResult(EString)
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getDraw_Result()
   * @model containment="true"
   * @generated
   */
  EString getResult();

  /**
   * Sets the value of the '{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Draw#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(EString value);

} // Draw
