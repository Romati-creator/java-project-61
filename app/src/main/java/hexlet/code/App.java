package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Event;
import hexlet.code.games.Calc;
import hexlet.code.games.NOD;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        switch (game) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Event.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            case "4":
                NOD.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            default:  System.out.println("Wrong choice. Please select a number from 1 to 6.");
        }
    }
}
