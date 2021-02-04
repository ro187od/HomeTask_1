package Lust;

import Lust.chess_piece.Desk;
import Lust.chess_piece.Knight;
import Lust.chess_piece.Queen;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//      создаём новую доску
        Desk desk = new Desk();
//      создаём позицию
        ChessPiecePosition position = new ChessPiecePosition("F6");
        ChessPiecePosition position_2 = new ChessPiecePosition("D2");
        Knight knight = new Knight(desk, position_2);
        Queen queen = new Queen(desk, position);
        desk = knight.countPositionThatIShoot();
        desk = queen.countPositionThatIShoot();
        desk.print();
    }
}
