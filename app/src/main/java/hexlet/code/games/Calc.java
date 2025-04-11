package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS;

public class Calc {
    private static final int MAX_VALUE = 10;
    private static final String ACTION = "What is the result of the expression?";

    public static void startGame() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[NUMBER_OF_ELEMENTS][2];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int operation = random.nextInt(NUMBER_OF_ELEMENTS);
            int numberRandom = random.nextInt(MAX_VALUE);
            int numberRandomTwo = random.nextInt(MAX_VALUE);
            calculation(numberRandom, numberRandomTwo, operation, questionAndAnswer, i);
        }
        Engine.playGame1(questionAndAnswer, ACTION);
    }
    private static void calculation(int numberRandom, int numberRandomTwo, int operation,
                                    String[][] questionAndAnswer, int index) {
        int result;

        if (operation == 0) {
            result = numberRandom + numberRandomTwo;
            questionAndAnswer[index][0] = numberRandom + " + " + numberRandomTwo;
            questionAndAnswer[index][1] = String.valueOf(result);
        } else if (operation == 1) {
            result = numberRandom - numberRandomTwo;
            questionAndAnswer[index][0] = numberRandom + " - " + numberRandomTwo;
            questionAndAnswer[index][1] = String.valueOf(result);
        } else {
            result = numberRandom * numberRandomTwo;
            questionAndAnswer[index][0] = numberRandom + " * " + numberRandomTwo;
            questionAndAnswer[index][1] = String.valueOf(result);
        }
    }
}
