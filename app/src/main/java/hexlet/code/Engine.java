package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ELEMENTS = 3;
    private static final int ROUNDS_COUNT = 3; // Количество раундов
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void playGame1(String[][] questionAndAnswer, String action) {
        // Приветствие пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        // Считывание имени пользователя
        String name = SCANNER.nextLine();
        // Приветствие по имени
        System.out.println("Hello, " + name + "!");
        // Выберите ответ
        System.out.println(action);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            //Вопрос
            System.out.println("Question: " + questionAndAnswer[i][0]);
            // Ответ игрока
            String userAnswer = SCANNER.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (!userAnswer.equals(questionAndAnswer[i][1])) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + questionAndAnswer[i][1]
                        + "\nLet's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        // Поздравление после завершения всех раундов
        System.out.println("Congratulations, " + name + "!");
    }
}


