package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Выберите игру и нажмите Enter
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Event\n"
                + "3 - Calc\n"
                + "0 - Exit");

        // Считывание выбора игры
        String game = scanner.nextLine();
        // Твой выбор
        System.out.println("Your choice: " + game);

        if (game.equals("2")) {
            Event.startGame();
        } else if (game.equals("3")) {
            Calc.startGame();
        }
    }
}
