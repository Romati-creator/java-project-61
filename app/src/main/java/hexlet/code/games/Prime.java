package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void startGame() {
        Random random = new Random();
        String[] rightAnswer = new String[3];
        String[] question = new String[3];
        String action = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {
            int numberRandom = random.nextInt(10);
            question[i] = String.valueOf(numberRandom);

            if (numberRandom < 2) {
                rightAnswer[i] = "no";
            } else if (numberRandom == 2) {
                rightAnswer[i] = "yes";
            } else if (numberRandom % 2 == 0) {
                rightAnswer[i] = "no";
            } else {
                rightAnswer[i] = "yes";
                for (int x = 3; x <= Math.sqrt(numberRandom); x += 2) {
                    if (numberRandom % i == 0) {
                        rightAnswer[i] = "no";
                        break;
                    }
                }
            }
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
