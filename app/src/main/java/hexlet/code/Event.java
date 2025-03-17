package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Event {
    public static void startGame() {
        Random random = new Random();
        Engine.startGame();
        Engine.playGame("2");
    }
}


//package hexlet.code;
//import java.util.Scanner;
//import java.util.Random;
//
//public class Event {
//    public static void startGame() {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        // Приветствие пользователя
//        GameSelection.greetUser();
//        // Получение имени пользователя
//        String name = GameSelection.getName();
//        // Выберите ответ
//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
//        //Логика игры
//        for (int x = 0; x < 3; x++) {
//            //Рандомное число
//            int count = random.nextInt();
//            System.out.println("Question: " + count);
//            //Переменные выбор пользователя и корректное значение
//            String userAnswer = scanner.nextLine().trim().toLowerCase();
//            String correctAnswer = count % 2 == 0 ? "yes" : "no";
//            //Проверка правильного ввода выбора ответа
//            if (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
//                System.out.println("Ошибка: некорректный ввод. Пожалуйста, введите 'yes' или 'no'.");
//                return;
//            }
//            //Ваш ответ
//            System.out.println("Your answer: " + userAnswer);
//
//            if (!userAnswer.equals(correctAnswer)) {
//                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer
//                        + "\nLet's try again, " + name + "!");
//                return;
//            } else {
//                System.out.println("Correct!");
//            }
//        }
//        System.out.println("Congratulations, " + name + "!");
//    }
//}
