package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS;

public class NOD {
    private static final int MAX_VALUE = 10;
    private static final String ACTION = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[NUMBER_OF_ELEMENTS][2];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int numberRandom = random.nextInt(MAX_VALUE) + 1;
            int numberRandomTwo = random.nextInt(MAX_VALUE) + 1;
            questionAndAnswer[i][0] = numberRandom + " " + numberRandomTwo;
            questionAndAnswer[i][1] = calculationNod(numberRandom, numberRandomTwo);
        }
        Engine.playGame1(questionAndAnswer, ACTION);
    }

    private static String calculationNod(int numberRandom, int numberRandomTwo) {
        int temp = 0;
        while (numberRandomTwo != 0) {
            temp = numberRandomTwo;
            numberRandomTwo = numberRandom % numberRandomTwo;
            numberRandom = temp;
        }
        return String.valueOf(temp);
    }
}
