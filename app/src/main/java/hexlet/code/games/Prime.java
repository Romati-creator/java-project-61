package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void startGame() {
        Random random = new Random();
        int countRound = 3;
        int countSize = 10;
        String[] rightAnswer = new String[countRound];
        String[] question = new String[countRound];
        String action = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < countRound; i++) {
            int numberRandom = random.nextInt(countSize) + 2;
            question[i] = String.valueOf(numberRandom);

            if (numberRandom < 2) {
                rightAnswer[i] = "no";
            } else if (numberRandom == 2) {
                rightAnswer[i] = "yes";
            } else if (numberRandom % 2 == 0) {
                rightAnswer[i] = "no";
            } else {
                rightAnswer[i] = "yes";
                for (int x = countRound; x <= Math.sqrt(numberRandom); x += 2) {
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
