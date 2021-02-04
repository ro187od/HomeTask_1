package Lust;

public class ChessPiecePosition {
//  буквенная часть позиция
    private char letterPos;
//  цифровая часть позиции
    private char digitPos;
//  конструктор принимат в себя строку
    public ChessPiecePosition(String inputPosition) {
//      разбиваем строки на переменные для взаимодействия с двухмерным массивом
        this.letterPos = inputPosition.charAt(0);
        this.digitPos = inputPosition.charAt(1);
    }

    public int getLetterPos() {
        return letterPos - 'A';
    }

    public int getDigitPos() {
        return digitPos - '1';
    }
}
