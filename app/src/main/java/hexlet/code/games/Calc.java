package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class Calc {
    private static final int MAX_VALUE = 10;
    private static final String ACTION = "What is the result of the expression?";

    public static void startGame() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int operation = random.nextInt(ROUNDS_COUNT);
            int numberRandom = random.nextInt(MAX_VALUE);
            int numberRandomTwo = random.nextInt(MAX_VALUE);
            String operator = getOpertor(operation);
            int result = calculation(numberRandom, numberRandomTwo, operator);
            questionAndAnswer[i][0] = numberRandom + " " + operator + " " + numberRandomTwo;
            questionAndAnswer[i][1] = String.valueOf(result);
        }
        Engine.playGame1(questionAndAnswer, ACTION);
    }
    private static int calculation(int numberRandom, int numberRandomTwo, String operator) {
        switch (operator) {
            case "+":
                return numberRandom + numberRandomTwo;
            case "-":
                return numberRandom - numberRandomTwo;
            case "*":
                return numberRandom * numberRandomTwo;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
    private static String getOpertor(int operation) {
        switch (operation) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
            default:
                throw new IllegalArgumentException("Unknown operation index: " + operation);
        }
    }
}
