package Lust.chess_piece;

import Lust.ChessPiecePosition;

public class ChessPiece {
//  класс ChessPiece содержит объект доски
    protected Desk desk;
//  класс ChessPiece содержит объект позиция
    protected ChessPiecePosition position;
//  при создании фигуры передаётся созданная доска и позиция
    public ChessPiece(Desk desk, ChessPiecePosition position) {
        this.desk = desk;
        this.position = position;
    }

    public Desk countPositionThatIShoot() {
        return null;
    }
}
