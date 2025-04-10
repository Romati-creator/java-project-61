package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void startGame() {
        Random random = new Random();
        int countRound = 3;
        int countSize = 10;
        String[] rightAnswer = new String[countRound];
        String[] question = new String[countRound];
        String action = "What number is missing in the progression?";

        for (int i = 0; i < countRound; i++) {
            int numberRandom = random.nextInt(countSize);
            int numberRandomTwo = random.nextInt(countSize);
            int difference = numberRandom - numberRandomTwo;
            String[] progression = new String[countSize];
            int countRandom = random.nextInt(countSize);
            progression[0] = String.valueOf(numberRandom);
            int number = numberRandom;

            for (int x = 1; x < countSize; x++) {
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



