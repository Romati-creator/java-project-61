package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scannerName = new Scanner(System.in);
        // Приветствие пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        // Считывание имени пользователя
        String name = scannerName.nextLine();
        // Приветствие по имени
        System.out.println("Hello, " + name + "!");

    }
}
