package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Event {
    public static void startGame() {
        Random random = new Random();
        int[] countRound = new int[3];
        String[] rightAnswer = new String[3];
        String[] question = new String[3];
        String action = "Answer 'yes' if number even otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {
            int randomCount = random.nextInt(10);
            countRound[i] = randomCount;
            rightAnswer[i] = randomCount % 2 == 0 ? "yes" : "no";
            question[i] = String.valueOf(countRound[i]);
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
