package hexlet.code.games;


import hexlet.code.Engine;

public class Event {
    public static void startGame() {
        Engine.startGame();
        // Выберите ответ
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.playGame("2");
    }
}

