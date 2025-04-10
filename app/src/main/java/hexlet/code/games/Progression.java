package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int NUMBER_OF_ELEMENTS = 3;
    private static final int MAX_VALUE = 10;

    public static void startGame() {
        Random random = new Random();
        String[] rightAnswer = new String[NUMBER_OF_ELEMENTS];
        String[] question = new String[NUMBER_OF_ELEMENTS];
        String action = "What number is missing in the progression?";

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int numberRandom = random.nextInt(MAX_VALUE);
            int numberRandomTwo = random.nextInt(MAX_VALUE);
            int difference = numberRandom - numberRandomTwo;
            String[] progression = new String[MAX_VALUE];
            int countRandom = random.nextInt(MAX_VALUE);
            progression[0] = String.valueOf(numberRandom);
            int number = numberRandom;

            for (int x = 1; x < MAX_VALUE; x++) {
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



