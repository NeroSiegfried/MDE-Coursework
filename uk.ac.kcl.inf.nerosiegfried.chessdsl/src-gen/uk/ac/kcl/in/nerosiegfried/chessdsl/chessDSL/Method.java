/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Method#getWin <em>Win</em>}</li>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Method#getDraw <em>Draw</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject
{
  /**
   * Returns the value of the '<em><b>Win</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Win</em>' containment reference.
   * @see #setWin(Win)
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMethod_Win()
   * @model containment="true"
   * @generated
   */
  Win getWin();

  /**
   * Sets the value of the '{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Method#getWin <em>Win</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Win</em>' containment reference.
   * @see #getWin()
   * @generated
   */
  void setWin(Win value);

  /**
   * Returns the value of the '<em><b>Draw</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Draw</em>' containment reference.
   * @see #setDraw(Draw)
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMethod_Draw()
   * @model containment="true"
   * @generated
   */
  Draw getDraw();

  /**
   * Sets the value of the '{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Method#getDraw <em>Draw</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Draw</em>' containment reference.
   * @see #getDraw()
   * @generated
   */
  void setDraw(Draw value);

} // Method
