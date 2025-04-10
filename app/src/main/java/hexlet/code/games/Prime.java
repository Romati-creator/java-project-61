package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int NUMBER_OF_ELEMENTS = 3;
    private static final int MAX_VALUE = 10;

    public static void startGame() {
        Random random = new Random();
        String[] rightAnswer = new String[NUMBER_OF_ELEMENTS];
        String[] question = new String[NUMBER_OF_ELEMENTS];
        String action = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int numberRandom = random.nextInt(MAX_VALUE) + 2;
            question[i] = String.valueOf(numberRandom);

            if (numberRandom < 2) {
                rightAnswer[i] = "no";
            } else if (numberRandom == 2) {
                rightAnswer[i] = "yes";
            } else if (numberRandom % 2 == 0) {
                rightAnswer[i] = "no";
            } else {
                rightAnswer[i] = "yes";
                for (int x = NUMBER_OF_ELEMENTS; x <= Math.sqrt(numberRandom); x += 2) {
                    if (numberRandom % x == 0) {
                        rightAnswer[i] = "no";
                        break;
                    }
                }
            }
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
