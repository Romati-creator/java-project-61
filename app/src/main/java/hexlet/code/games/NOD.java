package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class NOD {
    public static void startGame() {
        Random random = new Random();
        String[] rightAnswer = new String[3];
        String[] question = new String[3];
        String action = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < 3; i++) {
            int numberRandom = random.nextInt(10);
            int numberRandomTwo = random.nextInt(10);
            question[i] = numberRandom + " " + numberRandomTwo;

            while (numberRandomTwo != 0) {
                int temp = numberRandomTwo;
                numberRandomTwo = numberRandom % numberRandomTwo;
                numberRandom = temp;
                rightAnswer[i] = String.valueOf(temp);
            }
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}
