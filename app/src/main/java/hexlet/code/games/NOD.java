package hexlet.code.games;

import hexlet.code.Engine;

public class NOD {
    public static void startGame() {
        Engine.startGame();
        // Выберите ответ
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.playGame("4");

    }
}
