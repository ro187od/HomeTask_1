package Lust.chess_piece;

import Lust.ChessPiecePosition;

public class ChessElephant extends ChessPiece{

    public ChessElephant(Desk desk, ChessPiecePosition position) {
        super(desk, position);
    }

    private Desk diagonalShoot() {
////      правый нижний угол
        for(int i = position.getDigitPos(), p = 0; i < 8; i++, p++){
            if(position.getDigitPos() - p == -1 ){
                break;
            }
            desk.shoot(i, position.getLetterPos() + p);
        }
////      правый верхний угол
        for(int i = position.getDigitPos(), p = 0; i >= 0; i--, p++){
            if(position.getLetterPos() + p == 8){
                break;
            }
            desk.shoot(i, position.getLetterPos() + p);
        }
////      левый верхний угол
        for(int i = position.getLetterPos(), p = 0; i >= 0; i--, p++){
            if (position.getDigitPos() - p == -1 ){
                break;
            }
            desk.shoot(position.getDigitPos() - p, i);
        }
//      левый нижний угол
        for(int i = position.getLetterPos(), p = 0; i >= 0; i--, p++){
            if (position.getDigitPos() + p == 8 ){
                break;
            }
            desk.shoot(position.getDigitPos() + p, i);
        }
        desk.shoot(position.getDigitPos(), position.getLetterPos());

        return desk;
    }
}
