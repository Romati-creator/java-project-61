package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startGame() {
        Engine.startGame();
        // Выберите ответ
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.playGame("6");

    }
}
