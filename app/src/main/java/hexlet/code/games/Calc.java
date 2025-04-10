package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int NUMBER_OF_ELEMENTS = 3;
    private static final int MAX_VALUE = 10;

    public static void startGame() {
        Random random = new Random();
        String[] rightAnswer = new String[NUMBER_OF_ELEMENTS];
        String[] question = new String[NUMBER_OF_ELEMENTS];
        String action = "What is the result of the expression?";

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int operation = random.nextInt(NUMBER_OF_ELEMENTS);
            int numberRandom = random.nextInt(MAX_VALUE);
            int numberRandomTwo = random.nextInt(MAX_VALUE);

            int result;
            if (operation == 0) {
                result = numberRandom + numberRandomTwo;
                question[i] = numberRandom + " + " + numberRandomTwo;
                rightAnswer[i] = String.valueOf(result);
            } else if (operation == 1) {
                result = numberRandom - numberRandomTwo;
                question[i] = numberRandom + " - " + numberRandomTwo;
                rightAnswer[i] = String.valueOf(result);
            } else {
                result = numberRandom * numberRandomTwo;
                question[i] = numberRandom + " * " + numberRandomTwo;
                rightAnswer[i] = String.valueOf(result);
            }
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
