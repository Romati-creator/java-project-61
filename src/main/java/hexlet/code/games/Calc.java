package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void startGame() {
        Engine.startGame();
        // Выберите ответ
        System.out.println("What is the result of the expression?");
        Engine.playGame("3");

    }
}
