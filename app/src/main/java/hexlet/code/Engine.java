package hexlet.code;

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
            logicGame(random.nextInt(100), random.nextInt(100), gameNumber); // Запуск логики игры
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

        if (gameNumber.equals("2")) {
            correctAnswer = numberRandom % 2 == 0 ? "yes" : "no";
            // Выберите ответ
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            //Вопрос
            System.out.println("Question: " + numberRandom);
            // Ответ игрока
            userAnswer = SCANNER.nextLine();
            System.out.println("Your answer: " + userAnswer);
        }
    }
}
//        System.out.println("Congratulations, " + name + "!");

