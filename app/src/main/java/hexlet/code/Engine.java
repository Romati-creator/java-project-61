package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String name;
    private static String userAnswer;
    private static String correctAnswer;
    private static final int ROUNDS_COUNT = 3; // Количество раундов
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void startGame() {
        // Приветствие пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        // Считывание имени пользователя
        name = SCANNER.nextLine();
        // Приветствие по имени
        System.out.println("Hello, " + name + "!");
    }

    public static void playGame(String gameNumber) {
        int successfulRounds = 0; // Счетчик успешных раундов
        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            logicGame(random.nextInt(10) + 1, random.nextInt(10) + 1, gameNumber); // Запуск логики игры
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer
                        + "\nLet's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
                successfulRounds++; // Увеличиваем счетчик успешных раундов
            }
        }

        // Поздравление после завершения всех раундов
        System.out.println("Congratulations, " + name + "!");
    }

    public static void logicGame(int numberRandom, int numberRandomTwo, String gameNumber) {
        Random random = new Random();
        if (gameNumber.equals("2")) {
            correctAnswer = numberRandom % 2 == 0 ? "yes" : "no";
            //Вопрос
            System.out.println("Question: " + numberRandom);
        } else if (gameNumber.equals("3")) {
            int operation = random.nextInt(3);
            String operationSymbol;
            int result;
            if (operation == 0) {
                result = numberRandom + numberRandomTwo;
                operationSymbol = "+";
            } else if (operation == 1) {
                result = numberRandom - numberRandomTwo;
                operationSymbol = "-";
            } else {
                result = numberRandom * numberRandomTwo;
                operationSymbol = "*";
            }
            correctAnswer = String.valueOf(result);
            //Вопрос
            System.out.println("Question: " + numberRandom + " " + operationSymbol + " " + numberRandomTwo);
        } else if (gameNumber.equals("4")) {
            int countTwo = numberRandomTwo;
            while (numberRandomTwo != 0) {
                int temp = numberRandomTwo;
                numberRandomTwo = numberRandom % numberRandomTwo;
                numberRandom = temp;
                correctAnswer = String.valueOf(temp);
            }
            //Вопрос
            System.out.println("Question: " + numberRandom + " " + countTwo);
        } else if (gameNumber.equals("5")) {
            int difference = numberRandom - numberRandomTwo;
            String[] progression = new String[10];
            int countRandom = random.nextInt(10);
            progression[0] = String.valueOf(numberRandom);
            int number = numberRandom;

            for (int i = 1; i < 10; i++) {
                number += difference;
                progression[i] = String.valueOf(number);
            }
            String value = progression[countRandom];
            progression[countRandom] = "..";
            //Вопрос
            System.out.println("Question: " + Arrays.toString(progression));
            correctAnswer = String.valueOf(value);
        } else if (gameNumber.equals("6")) {
            if (numberRandom < 2) {
                correctAnswer = "no";
            } else if (numberRandom == 2) {
                correctAnswer = "yes";
            } else if (numberRandom % 2 == 0) {
                correctAnswer = "no";
            } else {
                correctAnswer = "yes";
                for (int i = 3; i <= Math.sqrt(numberRandom); i += 2) {
                    if (numberRandom % i == 0) {
                        correctAnswer = "no";
                        break;
                    }
                }
            }
            //Вопрос
            System.out.println("Question: " + numberRandom);
        }
        // Ответ игрока
        userAnswer = SCANNER.nextLine();
        System.out.println("Your answer: " + userAnswer);
    }
}


