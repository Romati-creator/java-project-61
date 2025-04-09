package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        // Выберите игру и нажмите Enter
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Event\n"
                + "3 - Calc\n"
                + "4 - NOD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");

        // Считывание выбора игры
        String game = scanner.nextLine();
        // Твой выбор
        System.out.println("Your choice: " + game);

        if (game.equals("2")) {
            Event.startGame();
        } else if (game.equals("3")) {
            Calc.startGame();
        } else if (game.equals("4")) {
            NOD.startGame();
        } else if (game.equals("5")) {
            Progression.startGame();
        } else if (game.equals("6")) {
            Prime.startGame();
        }
    }
}
