package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS;

public class Event {
    private static final int MAX_VALUE = 10;
    private static final String ACTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        Random random = new Random();
        int[] countRound = new int[NUMBER_OF_ELEMENTS];
        String[][] questionAndAnswer = new String[NUMBER_OF_ELEMENTS][2];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int randomCount = random.nextInt(MAX_VALUE);
            countRound[i] = randomCount;
            questionAndAnswer[i][0] = String.valueOf(countRound[i]);
            questionAndAnswer[i][1] = randomCount % 2 == 0 ? "yes" : "no";
        }
        Engine.playGame1(questionAndAnswer, ACTION);
    }
}
