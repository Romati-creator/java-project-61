package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.NUMBER_OF_ELEMENTS;

public class Prime {
    private static final int MAX_VALUE = 10;
    private static final String ACTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[NUMBER_OF_ELEMENTS][2];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int numberRandom = random.nextInt(MAX_VALUE) + 2;
            questionAndAnswer[i][0] = String.valueOf(numberRandom);
            questionAndAnswer[i][1] = isPrime(numberRandom) ? "yes" : "no";
        }
        Engine.playGame1(questionAndAnswer, ACTION);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int x = NUMBER_OF_ELEMENTS; x <= Math.sqrt(number); x += 2) {
            if (number % x == 0) {
                return false;
            }
        }
        return true;
    }
}

