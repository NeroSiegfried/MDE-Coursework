/**
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChessDSLFactoryImpl extends EFactoryImpl implements ChessDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChessDSLFactory init()
  {
    try
    {
      ChessDSLFactory theChessDSLFactory = (ChessDSLFactory)EPackage.Registry.INSTANCE.getEFactory(ChessDSLPackage.eNS_URI);
      if (theChessDSLFactory != null)
      {
        return theChessDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ChessDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChessDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ChessDSLPackage.MODEL: return createModel();
      case ChessDSLPackage.GAME: return createGame();
      case ChessDSLPackage.PLAYER: return createPlayer();
      case ChessDSLPackage.INITIAL_STATE: return createInitialState();
      case ChessDSLPackage.CUSTOM_POSITIONS: return createCustomPositions();
      case ChessDSLPackage.PLACEMENT: return createPlacement();
      case ChessDSLPackage.CUSTOM_PIECE: return createCustomPiece();
      case ChessDSLPackage.MOVE_PAIR: return createMovePair();
      case ChessDSLPackage.ANY_MOVE: return createAnyMove();
      case ChessDSLPackage.DSL_MOVE: return createDSLMove();
      case ChessDSLPackage.DUMMY: return createDummy();
      case ChessDSLPackage.MOVE: return createMove();
      case ChessDSLPackage.CAPTURE: return createCapture();
      case ChessDSLPackage.CASTLE: return createCastle();
      case ChessDSLPackage.EN_PASSANT: return createEnPassant();
      case ChessDSLPackage.PROMOTION: return createPromotion();
      case ChessDSLPackage.SAN_MOVE: return createSANMove();
      case ChessDSLPackage.SAN_CASTLE: return createSANCastle();
      case ChessDSLPackage.SAN_NORMAL: return createSANNormal();
      case ChessDSLPackage.SAN_PIECE: return createSANPiece();
      case ChessDSLPackage.SAN_DISAMBIGUATION: return createSANDisambiguation();
      case ChessDSLPackage.SAN_PROMOTION: return createSANPromotion();
      case ChessDSLPackage.SAN_CHECK_MARKER: return createSANCheckMarker();
      case ChessDSLPackage.SAN_CAPTURE: return createSANCapture();
      case ChessDSLPackage.SAN_REMARK: return createSANRemark();
      case ChessDSLPackage.CONCLUSION: return createConclusion();
      case ChessDSLPackage.METHOD: return createMethod();
      case ChessDSLPackage.WIN: return createWin();
      case ChessDSLPackage.TIME_UP: return createTimeUp();
      case ChessDSLPackage.RESIGN: return createResign();
      case ChessDSLPackage.CHECKMATE: return createCheckmate();
      case ChessDSLPackage.DRAW: return createDraw();
      case ChessDSLPackage.ESTRING: return createEString();
      case ChessDSLPackage.RESULT: return createResult();
      case ChessDSLPackage.PLAYER_OR_COLOR: return createPlayerOrColor();
      case ChessDSLPackage.SQUARE: return createSquare();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ChessDSLPackage.REMARK:
        return createRemarkFromString(eDataType, initialValue);
      case ChessDSLPackage.COLOR:
        return createColorFromString(eDataType, initialValue);
      case ChessDSLPackage.PIECE:
        return createPieceFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ChessDSLPackage.REMARK:
        return convertRemarkToString(eDataType, instanceValue);
      case ChessDSLPackage.COLOR:
        return convertColorToString(eDataType, instanceValue);
      case ChessDSLPackage.PIECE:
        return convertPieceToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Game createGame()
  {
    GameImpl game = new GameImpl();
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Player createPlayer()
  {
    PlayerImpl player = new PlayerImpl();
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InitialState createInitialState()
  {
    InitialStateImpl initialState = new InitialStateImpl();
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CustomPositions createCustomPositions()
  {
    CustomPositionsImpl customPositions = new CustomPositionsImpl();
    return customPositions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Placement createPlacement()
  {
    PlacementImpl placement = new PlacementImpl();
    return placement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CustomPiece createCustomPiece()
  {
    CustomPieceImpl customPiece = new CustomPieceImpl();
    return customPiece;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MovePair createMovePair()
  {
    MovePairImpl movePair = new MovePairImpl();
    return movePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnyMove createAnyMove()
  {
    AnyMoveImpl anyMove = new AnyMoveImpl();
    return anyMove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSLMove createDSLMove()
  {
    DSLMoveImpl dslMove = new DSLMoveImpl();
    return dslMove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dummy createDummy()
  {
    DummyImpl dummy = new DummyImpl();
    return dummy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Move createMove()
  {
    MoveImpl move = new MoveImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Capture createCapture()
  {
    CaptureImpl capture = new CaptureImpl();
    return capture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Castle createCastle()
  {
    CastleImpl castle = new CastleImpl();
    return castle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnPassant createEnPassant()
  {
    EnPassantImpl enPassant = new EnPassantImpl();
    return enPassant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Promotion createPromotion()
  {
    PromotionImpl promotion = new PromotionImpl();
    return promotion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANMove createSANMove()
  {
    SANMoveImpl sanMove = new SANMoveImpl();
    return sanMove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANCastle createSANCastle()
  {
    SANCastleImpl sanCastle = new SANCastleImpl();
    return sanCastle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANNormal createSANNormal()
  {
    SANNormalImpl sanNormal = new SANNormalImpl();
    return sanNormal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANPiece createSANPiece()
  {
    SANPieceImpl sanPiece = new SANPieceImpl();
    return sanPiece;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANDisambiguation createSANDisambiguation()
  {
    SANDisambiguationImpl sanDisambiguation = new SANDisambiguationImpl();
    return sanDisambiguation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANPromotion createSANPromotion()
  {
    SANPromotionImpl sanPromotion = new SANPromotionImpl();
    return sanPromotion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANCheckMarker createSANCheckMarker()
  {
    SANCheckMarkerImpl sanCheckMarker = new SANCheckMarkerImpl();
    return sanCheckMarker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANCapture createSANCapture()
  {
    SANCaptureImpl sanCapture = new SANCaptureImpl();
    return sanCapture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SANRemark createSANRemark()
  {
    SANRemarkImpl sanRemark = new SANRemarkImpl();
    return sanRemark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conclusion createConclusion()
  {
    ConclusionImpl conclusion = new ConclusionImpl();
    return conclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Win createWin()
  {
    WinImpl win = new WinImpl();
    return win;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUp createTimeUp()
  {
    TimeUpImpl timeUp = new TimeUpImpl();
    return timeUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Resign createResign()
  {
    ResignImpl resign = new ResignImpl();
    return resign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Checkmate createCheckmate()
  {
    CheckmateImpl checkmate = new CheckmateImpl();
    return checkmate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Draw createDraw()
  {
    DrawImpl draw = new DrawImpl();
    return draw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EString createEString()
  {
    EStringImpl eString = new EStringImpl();
    return eString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Result createResult()
  {
    ResultImpl result = new ResultImpl();
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlayerOrColor createPlayerOrColor()
  {
    PlayerOrColorImpl playerOrColor = new PlayerOrColorImpl();
    return playerOrColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Square createSquare()
  {
    SquareImpl square = new SquareImpl();
    return square;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Remark createRemarkFromString(EDataType eDataType, String initialValue)
  {
    Remark result = Remark.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRemarkToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColorFromString(EDataType eDataType, String initialValue)
  {
    Color result = Color.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Piece createPieceFromString(EDataType eDataType, String initialValue)
  {
    Piece result = Piece.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPieceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChessDSLPackage getChessDSLPackage()
  {
    return (ChessDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ChessDSLPackage getPackage()
  {
    return ChessDSLPackage.eINSTANCE;
  }

} //ChessDSLFactoryImpl
