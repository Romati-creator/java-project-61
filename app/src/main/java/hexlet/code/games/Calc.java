package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void startGame() {
        Random random = new Random();
        int countRound = 3;
        int countSize = 10;
        String[] rightAnswer = new String[countRound];
        String[] question = new String[countRound];
        String action = "What is the result of the expression?";

        for (int i = 0; i < countRound; i++) {
            int operation = random.nextInt(countRound);
            int numberRandom = random.nextInt(countSize);
            int numberRandomTwo = random.nextInt(countSize);

            int result;
            if (operation == 0) {
                result = numberRandom + numberRandomTwo;
                question[i] = numberRandom + " + " + numberRandomTwo;
                rightAnswer[i] = String.valueOf(result);
            } else if (operation == 1) {
                result = numberRandom - numberRandomTwo;
                question[i] = numberRandom + " - " + numberRandomTwo;
                rightAnswer[i] = String.valueOf(result);
            } else {
                result = numberRandom * numberRandomTwo;
                question[i] = numberRandom + " * " + numberRandomTwo;
                rightAnswer[i] = String.valueOf(result);
            }
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
