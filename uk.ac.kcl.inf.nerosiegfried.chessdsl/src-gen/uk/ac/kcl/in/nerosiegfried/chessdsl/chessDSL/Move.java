/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Move#getPiece <em>Piece</em>}</li>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Move#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Move#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends DSLMove
{
  /**
   * Returns the value of the '<em><b>Piece</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Piece}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Piece</em>' attribute.
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Piece
   * @see #setPiece(Piece)
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMove_Piece()
   * @model
   * @generated
   */
  Piece getPiece();

  /**
   * Sets the value of the '{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Move#getPiece <em>Piece</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Piece</em>' attribute.
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Piece
   * @see #getPiece()
   * @generated
   */
  void setPiece(Piece value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(Square)
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMove_From()
   * @model containment="true"
   * @generated
   */
  Square getFrom();

  /**
   * Sets the value of the '{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Move#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Square value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(Square)
   * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage#getMove_To()
   * @model containment="true"
   * @generated
   */
  Square getTo();

  /**
   * Sets the value of the '{@link uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Move#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Square value);

} // Move
