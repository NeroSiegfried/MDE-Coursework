/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage
 * @generated
 */
public interface ChessDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ChessDSLFactory eINSTANCE = uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl.ChessDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game</em>'.
   * @generated
   */
  Game createGame();

  /**
   * Returns a new object of class '<em>Player</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Player</em>'.
   * @generated
   */
  Player createPlayer();

  /**
   * Returns a new object of class '<em>Initial State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial State</em>'.
   * @generated
   */
  InitialState createInitialState();

  /**
   * Returns a new object of class '<em>Custom Positions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Positions</em>'.
   * @generated
   */
  CustomPositions createCustomPositions();

  /**
   * Returns a new object of class '<em>Placement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Placement</em>'.
   * @generated
   */
  Placement createPlacement();

  /**
   * Returns a new object of class '<em>Custom Piece</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Piece</em>'.
   * @generated
   */
  CustomPiece createCustomPiece();

  /**
   * Returns a new object of class '<em>Move Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Pair</em>'.
   * @generated
   */
  MovePair createMovePair();

  /**
   * Returns a new object of class '<em>Any Move</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Move</em>'.
   * @generated
   */
  AnyMove createAnyMove();

  /**
   * Returns a new object of class '<em>DSL Move</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Move</em>'.
   * @generated
   */
  DSLMove createDSLMove();

  /**
   * Returns a new object of class '<em>Dummy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dummy</em>'.
   * @generated
   */
  Dummy createDummy();

  /**
   * Returns a new object of class '<em>Move</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move</em>'.
   * @generated
   */
  Move createMove();

  /**
   * Returns a new object of class '<em>Capture</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capture</em>'.
   * @generated
   */
  Capture createCapture();

  /**
   * Returns a new object of class '<em>Castle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Castle</em>'.
   * @generated
   */
  Castle createCastle();

  /**
   * Returns a new object of class '<em>En Passant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>En Passant</em>'.
   * @generated
   */
  EnPassant createEnPassant();

  /**
   * Returns a new object of class '<em>Promotion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Promotion</em>'.
   * @generated
   */
  Promotion createPromotion();

  /**
   * Returns a new object of class '<em>SAN Move</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SAN Move</em>'.
   * @generated
   */
  SANMove createSANMove();

  /**
   * Returns a new object of class '<em>Conclusion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conclusion</em>'.
   * @generated
   */
  Conclusion createConclusion();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Win</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Win</em>'.
   * @generated
   */
  Win createWin();

  /**
   * Returns a new object of class '<em>Time Up</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Up</em>'.
   * @generated
   */
  TimeUp createTimeUp();

  /**
   * Returns a new object of class '<em>Resign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resign</em>'.
   * @generated
   */
  Resign createResign();

  /**
   * Returns a new object of class '<em>Checkmate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Checkmate</em>'.
   * @generated
   */
  Checkmate createCheckmate();

  /**
   * Returns a new object of class '<em>Draw</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Draw</em>'.
   * @generated
   */
  Draw createDraw();

  /**
   * Returns a new object of class '<em>EString</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EString</em>'.
   * @generated
   */
  EString createEString();

  /**
   * Returns a new object of class '<em>Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result</em>'.
   * @generated
   */
  Result createResult();

  /**
   * Returns a new object of class '<em>Player Or Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Player Or Color</em>'.
   * @generated
   */
  PlayerOrColor createPlayerOrColor();

  /**
   * Returns a new object of class '<em>Square</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Square</em>'.
   * @generated
   */
  Square createSquare();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ChessDSLPackage getChessDSLPackage();

} //ChessDSLFactory
