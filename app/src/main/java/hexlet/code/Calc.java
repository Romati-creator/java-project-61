package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Выберите ответ
        System.out.println("What is the result of the expression?");
        //Логика игры
        for (int x = 0; x < 3; x++) {
            //Рандомное число
            int countOne = random.nextInt(100);
            int countTwo = random.nextInt(100);
            int operation = random.nextInt(3);
            String operationSymbol;
            int result;
            if (operation == 0) {
                result = countOne + countTwo;
                operationSymbol = "+";
            } else if (operation == 1) {
                result = countOne - countTwo;
                operationSymbol = "-";
            } else {
                result = countOne * countTwo;
                operationSymbol = "*";
            }
            System.out.println("Question: " + countOne + operationSymbol + countTwo);
            //Переменные выбор пользователя и корректное значение
            int userAnswer = Integer.parseInt(scanner.nextLine());
            //Ваш ответ
            System.out.println("Your answer: " + userAnswer);
            //Проверка правильного ввода выбора ответа
            if (userAnswer != result) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + result
                        + "\nLet's try again, " +  "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, "  + "!");
    }
}
