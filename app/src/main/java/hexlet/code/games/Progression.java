package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void startGame() {
        Random random = new Random();
        String[] rightAnswer = new String[3];
        String[] question = new String[3];
        String action = "What number is missing in the progression?";

        for (int i = 0; i < 3; i++) {
            int numberRandom = random.nextInt(10);
            int numberRandomTwo = random.nextInt(10);
            int difference = numberRandom - numberRandomTwo;
            String[] progression = new String[10];
            int countRandom = random.nextInt(10);
            progression[0] = String.valueOf(numberRandom);
            int number = numberRandom;

            for (int x = 1; x < 10; x++) {
                number += difference;
                progression[x] = String.valueOf(number);
            }
            rightAnswer[i] = progression[countRandom];
            progression[countRandom] = "..";

            StringBuilder questionString = new StringBuilder();
            for (String num : progression) {
                questionString.append(num).append(" ");
            }
            question[i] = questionString.toString().trim();
        }
        Engine.playGame1(question, action, rightAnswer);
    }
}



