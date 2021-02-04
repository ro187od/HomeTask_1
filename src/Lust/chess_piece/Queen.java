package Lust.chess_piece;

import Lust.ChessPiecePosition;
//  наследует класс ладьи
public class Queen extends Rook {
//  создаём объект ферзь, передаём позицию и доску
    public Queen(Desk desk, ChessPiecePosition position) {
        super(desk, position);
    }

    @Override
    public Desk countPositionThatIShoot() {
        return fullShootFromQueen();
    }
//  вызываем метод, который замнит на доске - на +(показывает куда может походить фигура со своей позиции)
    private Desk fullShootFromQueen() {
        desk = horizontalAndVerticalShoot();
        desk = diagonalShoot();
        //ваша логика по диагональному нахождению, desk должен измениться!
        return desk;
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
