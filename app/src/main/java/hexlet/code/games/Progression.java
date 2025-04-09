package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void startGame() {
        Engine.startGame();
        // Выберите ответ
        System.out.println("What number is missing in the progression?");
        Engine.playGame("5");

    }
}
