/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage
 * @generated
 */
public class ChessDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ChessDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChessDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ChessDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ChessDSLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.GAME:
      {
        Game game = (Game)theEObject;
        T result = caseGame(game);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.PLAYER:
      {
        Player player = (Player)theEObject;
        T result = casePlayer(player);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.INITIAL_STATE:
      {
        InitialState initialState = (InitialState)theEObject;
        T result = caseInitialState(initialState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.CUSTOM_POSITIONS:
      {
        CustomPositions customPositions = (CustomPositions)theEObject;
        T result = caseCustomPositions(customPositions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.PLACEMENT:
      {
        Placement placement = (Placement)theEObject;
        T result = casePlacement(placement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.CUSTOM_PIECE:
      {
        CustomPiece customPiece = (CustomPiece)theEObject;
        T result = caseCustomPiece(customPiece);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.MOVE_PAIR:
      {
        MovePair movePair = (MovePair)theEObject;
        T result = caseMovePair(movePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.ANY_MOVE:
      {
        AnyMove anyMove = (AnyMove)theEObject;
        T result = caseAnyMove(anyMove);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.DSL_MOVE:
      {
        DSLMove dslMove = (DSLMove)theEObject;
        T result = caseDSLMove(dslMove);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.DUMMY:
      {
        Dummy dummy = (Dummy)theEObject;
        T result = caseDummy(dummy);
        if (result == null) result = caseDSLMove(dummy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.MOVE:
      {
        Move move = (Move)theEObject;
        T result = caseMove(move);
        if (result == null) result = caseDSLMove(move);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.CAPTURE:
      {
        Capture capture = (Capture)theEObject;
        T result = caseCapture(capture);
        if (result == null) result = caseDSLMove(capture);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.CASTLE:
      {
        Castle castle = (Castle)theEObject;
        T result = caseCastle(castle);
        if (result == null) result = caseDSLMove(castle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.EN_PASSANT:
      {
        EnPassant enPassant = (EnPassant)theEObject;
        T result = caseEnPassant(enPassant);
        if (result == null) result = caseDSLMove(enPassant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.PROMOTION:
      {
        Promotion promotion = (Promotion)theEObject;
        T result = casePromotion(promotion);
        if (result == null) result = caseDSLMove(promotion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.SAN_MOVE:
      {
        SANMove sanMove = (SANMove)theEObject;
        T result = caseSANMove(sanMove);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.CONCLUSION:
      {
        Conclusion conclusion = (Conclusion)theEObject;
        T result = caseConclusion(conclusion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.WIN:
      {
        Win win = (Win)theEObject;
        T result = caseWin(win);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.TIME_UP:
      {
        TimeUp timeUp = (TimeUp)theEObject;
        T result = caseTimeUp(timeUp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.RESIGN:
      {
        Resign resign = (Resign)theEObject;
        T result = caseResign(resign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.CHECKMATE:
      {
        Checkmate checkmate = (Checkmate)theEObject;
        T result = caseCheckmate(checkmate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.DRAW:
      {
        Draw draw = (Draw)theEObject;
        T result = caseDraw(draw);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.ESTRING:
      {
        EString eString = (EString)theEObject;
        T result = caseEString(eString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.RESULT:
      {
        Result result = (Result)theEObject;
        T theResult = caseResult(result);
        if (theResult == null) theResult = defaultCase(theEObject);
        return theResult;
      }
      case ChessDSLPackage.PLAYER_OR_COLOR:
      {
        PlayerOrColor playerOrColor = (PlayerOrColor)theEObject;
        T result = casePlayerOrColor(playerOrColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ChessDSLPackage.SQUARE:
      {
        Square square = (Square)theEObject;
        T result = caseSquare(square);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGame(Game object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Player</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlayer(Player object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialState(InitialState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Positions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Positions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomPositions(CustomPositions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Placement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Placement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlacement(Placement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Piece</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Piece</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomPiece(CustomPiece object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMovePair(MovePair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Move</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Move</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyMove(AnyMove object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL Move</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL Move</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSLMove(DSLMove object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dummy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dummy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDummy(Dummy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMove(Move object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capture</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capture</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapture(Capture object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Castle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Castle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastle(Castle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>En Passant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>En Passant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnPassant(EnPassant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Promotion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Promotion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePromotion(Promotion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SAN Move</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SAN Move</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSANMove(SANMove object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conclusion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conclusion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConclusion(Conclusion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Win</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Win</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWin(Win object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Up</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Up</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeUp(TimeUp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResign(Resign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkmate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkmate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckmate(Checkmate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Draw</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Draw</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDraw(Draw object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EString</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EString</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEString(EString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResult(Result object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Player Or Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Player Or Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlayerOrColor(PlayerOrColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Square</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Square</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSquare(Square object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ChessDSLSwitch
