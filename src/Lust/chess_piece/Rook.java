package Lust.chess_piece;

import Lust.ChessPiecePosition;
//  наследуется от класса ChessPiece
public class Rook extends ChessPiece {
//  передаём созданную доску и позицию
    public Rook(Desk desk, ChessPiecePosition position) {
        super(desk, position);
    }
//  переопределяем метод
    @Override
    public Desk countPositionThatIShoot() {
        return horizontalAndVerticalShoot();
    }

    //  при помощи этого метода мы меняем в доске все - по вертикали и горизонтали от фигуры на +
    //  + - это позиция, в которую может походить фигура
    public Desk horizontalAndVerticalShoot() {
//      цикл
//      i = буквенная позиция фигуры
//      i будет увеличивать до границы доски(8)
        for (int i = position.getLetterPos(); i < 8; i++) {
//          при каждом увеличении i вызывается метод shoot, в который передаётся i(letterPos + 1)
//          + передаётся digitPos
            desk.shoot(position.getDigitPos(), i);
        }
//      при помощи этого цикла мы замение - на + на доске по горизантли(цифра) влево
        for (int i = position.getLetterPos(); i >= 0; i--) {
            desk.shoot(position.getDigitPos(), i);
        }
        //      при помощи этого цикла мы замение - на + на доске по горизантли(буква) вверх
        for (int i = position.getDigitPos(); i < 8; i++) {
            desk.shoot(i, position.getLetterPos());
        }
        //      при помощи этого цикла мы замение - на + на доске по вертикали(буква) вниз
        for (int i = position.getDigitPos(); i >= 0; i--) {
            desk.shoot(i, position.getLetterPos());
        }
        return desk;
    }
}
