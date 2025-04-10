package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Event {
    public static void startGame() {
        Random random = new Random();
        int count = 3;
        int countSize = 10;
        int[] countRound = new int[count];
        String[] rightAnswer = new String[count];
        String[] question = new String[count];
        String action = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < count; i++) {
            int randomCount = random.nextInt(countSize);
            countRound[i] = randomCount;
            rightAnswer[i] = randomCount % 2 == 0 ? "yes" : "no";
            question[i] = String.valueOf(countRound[i]);
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
