package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Event {
    private static final int NUMBER_OF_ELEMENTS = 3;
    private static final int MAX_VALUE = 10;

    public static void startGame() {
        Random random = new Random();
        int[] countRound = new int[NUMBER_OF_ELEMENTS];
        String[] rightAnswer = new String[NUMBER_OF_ELEMENTS];
        String[] question = new String[NUMBER_OF_ELEMENTS];
        String action = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int randomCount = random.nextInt(MAX_VALUE);
            countRound[i] = randomCount;
            rightAnswer[i] = randomCount % 2 == 0 ? "yes" : "no";
            question[i] = String.valueOf(countRound[i]);
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
