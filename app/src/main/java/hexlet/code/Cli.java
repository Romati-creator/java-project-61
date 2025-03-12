package hexlet.code;
import java.util.Scanner;

public class Cli {
    private String name;

    public void greetUser() {
        Scanner scanner = new Scanner(System.in);

        // Приветствие пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        // Считывание имени пользователя
        this.name = scanner.nextLine();

        // Приветствие по имени
        System.out.println("Hello, " + name + "!");

    }
    public String getName() {
        return name;
    }
}
