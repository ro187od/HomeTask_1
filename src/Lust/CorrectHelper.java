package Lust;

public class CorrectHelper {
    public static boolean isCorrect(String inputPosition) {
        return inputPosition.length() == 2 &&
                isChessDigit(inputPosition.charAt(1)) &&
                isChessLetter(inputPosition.charAt(0));
    }

    private static boolean isChessLetter(char potentialLetter) {
        return potentialLetter >= 'A' && potentialLetter <= 'H';
    }

    private static boolean isChessDigit(char potentialDigit) {
        return potentialDigit > '0' && potentialDigit < '9';
    }

}
