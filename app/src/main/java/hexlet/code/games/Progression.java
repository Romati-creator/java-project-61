package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_OF_ELEMENTS;

public class Progression {
    private static final int MAX_VALUE = 10;
    private static final Random RANDOM = new Random();
    private static final String ACTION = "What number is missing in the progression?";

    public static void startGame() {
        String[][] questionAndAnswer = new String[NUMBER_OF_ELEMENTS][2];
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            int numberRandom = RANDOM.nextInt(MAX_VALUE);
            int difference = RANDOM.nextInt(MAX_VALUE / 2) + 1;
            int hiddenIndex = RANDOM.nextInt(MAX_VALUE);
            questionAndAnswer[i][0] = createQuestion(generateProgression(numberRandom, difference, hiddenIndex));
            questionAndAnswer[i][1] = String.valueOf(numberRandom + hiddenIndex * difference);
        }
        Engine.playGame1(questionAndAnswer, ACTION);
    }

    private static String[] generateProgression(int numberRandom, int difference, int hiddenIndex) {
        String[] progression = new String[MAX_VALUE];

        progression[0] = String.valueOf(numberRandom);
        int number = numberRandom;
        for (int x = 1; x < MAX_VALUE; x++) {
            number += difference;
            progression[x] = String.valueOf(number);
        }
        progression[hiddenIndex] = "..";
        return progression;
    }

    private static String createQuestion(String[] progression) {
        StringBuilder questionString = new StringBuilder();
        for (String num : progression) {
            questionString.append(num).append(" ");
        }
        return questionString.toString().trim();
    }
}



