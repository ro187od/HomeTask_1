package Lust;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    // singleton instance
    private static Input instance;

    private Scanner in;

    private Input(Scanner in) {
        this.in = in;
    }

    public static Input getInstance(Scanner in) {
        if (instance == null) {
            instance = new Input(in);
        }
        return instance;
    }

    public ArrayList<ChessPiecePosition> inputPositions() {
        ArrayList<ChessPiecePosition> positions = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String inputPosition = in.next();
            if (CorrectHelper.isCorrect(inputPosition)) {
                positions.add(new ChessPiecePosition(inputPosition));
            } else {
                System.out.println("ты ахуел ты что мне пихаешь");
            }
        }
        return positions;
    }
}
