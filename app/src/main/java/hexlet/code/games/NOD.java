package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class NOD {
    private static final int NUMBER_OF_ELEMENTS = 3;
    private static final int MAX_VALUE = 10;

    public static void startGame() {
        Random random = new Random();
        String[] rightAnswer = new String[NUMBER_OF_ELEMENTS];
        String[] question = new String[NUMBER_OF_ELEMENTS];
        String action = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int numberRandom = random.nextInt(MAX_VALUE) + 1;
            int numberRandomTwo = random.nextInt(MAX_VALUE) + 1;
            question[i] = numberRandom + " " + numberRandomTwo;

            while (numberRandomTwo != 0) {
                int temp = numberRandomTwo;
                numberRandomTwo = numberRandom % numberRandomTwo;
                numberRandom = temp;
                rightAnswer[i] = String.valueOf(temp);
            }
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
