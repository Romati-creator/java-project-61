package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class NOD {
    public static void startGame() {
        Random random = new Random();
        int countRound = 3;
        int countSize = 10;
        String[] rightAnswer = new String[countRound];
        String[] question = new String[countRound];
        String action = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < countRound; i++) {
            int numberRandom = random.nextInt(countSize);
            int numberRandomTwo = random.nextInt(countSize);
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
