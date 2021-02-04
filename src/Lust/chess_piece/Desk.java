package Lust.chess_piece;

public class Desk {
//  создаём двухмерный массив для имитации доски
    private char[][] deskTable;
//  создаём конструктор
    public Desk() {
//      задаём размер двухмерного массива(поле доски)
        deskTable = new char[8][8];
//      запускаем цикл до 8(поле доски)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
//              - значит свободна(дэфолтная) клетка
                deskTable[i][j] = '-';
            }
        }
    }
//  геттер для доски
    public char[][] getDeskTable() {
        return deskTable;
    }
//  сеттер для доски
    public void setDeskTable(char[][] deskTable) {
        this.deskTable = deskTable;
    }
//  изменяем поле доски на (+) - куда может походить фигура, передаём в неё позиции поля
    public void shoot(int i, int j) {
        deskTable[i][j] = '+';
        System.out.println(i + " " + j);
    }
//  выводим доску
    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(deskTable[i][j] + " ");
            }
            System.out.println();
        }
    }

//    public Desk save(){
//        deskTable =
//    }
}
