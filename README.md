# EasyChess

A Domain-Specific Modelling Language (DSML) designed for representing chess games in a more intuitive and human-readable manner. EasyChess simplifies traditional algebraic chess notation, making it easier for beginners and educators to use and understand.

## Overview

EasyChess bridges the gap between conventional chess notation and user-friendly descriptions. It offers:

- Human-readable descriptions of chess moves.
- Automatic validation of move legality.
- Generation of chess moves in multiple notation formats:
  - Standard Algebraic Notation (e.g., `5. e4 fxe4+`)
  - Concise DSML Notation (e.g., `Pawn(e2 -> e4)`)
  - Verbose DSML Notation (e.g., `White moves Pawn from e2 to e4`)

## Features

- Clearly defined grammar supporting regular and special chess moves (castling, captures, en passant, promotions).
- Comprehensive semantic validation of chess rules.
- Easy setup for custom initial positions.
- Generates notation in three complementary formats.

## Installation and Setup

### Prerequisites

- Java 17 or higher (maybe lower if you re-render the xtext artifacts)
- Eclipse IDE with Xtext plugin

### Setup Instructions

1. **Clone the repository**:

   ```
   git clone https://github.com/yourusername/EasyChess.git
   ```

2. **Import the project into Eclipse as an Xtext project**:
   - File → Import → General → Existing Projects into Workspace

3. **Generate the Xtext artifacts**:
   - Right-click the grammar file (`ChessDSL.xtext`) and select `Run As` → `Generate Xtext Artifacts`.

4. **Start runtime eclipse**:
   - Right-click `uk.ac.kcl.inf.nerosiegfried.chessdsl` from the Package Explorer and select `Run As` → `Eclipse Application`

## Using EasyChess

### Example Input

```easychess
Game "Fool's Mate"
Players:
  White: "Victor"
  Black: "Nero"
Moves:
1. Pawn(f2 -> f3) Pawn(e7 -> e6)
2. Victor moves Pawn(g2 -> g4)(Dubious)
   Nero moves Queen(d8 -> h4)(Checkmate)
end
Black wins
```

### Generated Output

**Standard Algebraic Notation:**
```
1. f3 e6
2. g4? Qh4#
Conclusion: Nero (Black) wins
0-1
```

**Concise DSML Notation:**
```
1. Pawn(f2 -> f3) Pawn(e7 -> e6)
2. Pawn(g2 -> g4)(Dubious) Queen(d8 -> h4)(Checkmate)
```

**Verbose DSML Notation:**
```
1. White moves Pawn from f2 to f3 and Black moves Pawn from e7 to e6
2. White moves Pawn from g2 to g4 (Dubious) and Black moves Queen from d8 to h4 (Checkmate)
```

## Validation and Error Handling

EasyChess automatically validates the legality of moves:

- Checks for illegal moves (blocked paths, invalid captures).
- Ensures correctness of special moves (castling, en passant).
- Validates game conclusions (checkmate, stalemate).

Errors are reported clearly to guide users in correcting their input.

## Future Work

Possible enhancements include:

- Advanced IDE integration (auto-completion, quick fixes).
- Support for chess variants (e.g., Chess960).
- Integration with graphical chessboard interfaces.

## Contributing

Feel free to fork this repository, submit issues, and create pull requests. Contributions are welcome!

## License

Don't know how this works

## Author

- Victor Nabasu - nerosiegfried@gmail.com

## To-Do List
- [X] Refine Validation
- [X] Extend Generation
- [X] Integrate Tests into Project
- [ ] Test Coverage
