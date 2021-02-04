package Lust.chess_piece;

import Lust.ChessPiecePosition;

public class Knight extends ChessPiece {

    public Knight(Desk desk, ChessPiecePosition position) {
        super(desk, position);
    }

    @Override
    public Desk countPositionThatIShoot() {
        return fullShootFromQueen();
    }

    private Desk fullShootFromQueen() {
        desk = knightMoves();
        return desk;
    }

    private Desk knightMoves() {
//      левый нижний угол
        if (position.getLetterPos() >=1 && position.getDigitPos() <= 5 ){
            desk.shoot(position.getDigitPos() + 2, position.getLetterPos() - 1);
        }
        if(position.getLetterPos() >=2 && position.getDigitPos() <= 6){
            desk.shoot(position.getDigitPos() + 1, position.getLetterPos() - 2);
        }

//      правый нижний угол
        if(position.getLetterPos() <= 5 && position.getDigitPos() <= 6){
            desk.shoot(position.getDigitPos() + 1, position.getLetterPos() + 2);
        }
        if(position.getLetterPos() <=6 && position.getDigitPos() <= 5){
            desk.shoot(position.getDigitPos() + 2, position.getLetterPos() + 1);
        }
//      левый верхний угол
        if (position.getLetterPos() >= 1 && position.getDigitPos() >= 2){
            desk.shoot(position.getDigitPos() - 2, position.getLetterPos() - 1);
        }
        if(position.getLetterPos() >=2 && position.getDigitPos() >=1){
            desk.shoot(position.getDigitPos() - 1, position.getLetterPos() - 2);
        }
//      правый верхний угол
        if(position.getLetterPos() <= 5 && position.getDigitPos() >= 1){
            desk.shoot(position.getDigitPos() - 1, position.getLetterPos() + 2);
        }
        if(position.getLetterPos() <= 6 && position.getDigitPos() >= 2){
            desk.shoot(position.getDigitPos() - 2, position.getLetterPos() + 1);
        }
        return desk;
    }
}
