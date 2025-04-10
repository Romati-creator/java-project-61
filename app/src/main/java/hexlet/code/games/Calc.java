package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void startGame() {
        Random random = new Random();
        String[] rightAnswer = new String[3];
        String[] question = new String[3];
        String action = "What is the result of the expression?";

        for (int i = 0; i < 3; i++) {
            int operation = random.nextInt(3);
            int numberRandom = random.nextInt(10);
            int numberRandomTwo = random.nextInt(10);

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
