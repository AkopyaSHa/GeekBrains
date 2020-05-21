package lesson3;

import java.util.Scanner;
import java.util.Random;

public class Task3_1_1 {
    public static void main(String[] args) {
        guessNumber();
    }

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private static int NEXT_GAME = 1;
    private static int FINISH = 0;

    private static int generateRandomNumber() {
        int num = random.nextInt(10);
        System.out.println("Угадай число с 3 попыток от 0 до 9");
        return num;
    }

    public static int getUserGuess() {
        System.out.println("Введи свой ответ:");
        return scanner.nextInt();
    }

    public static boolean isGuessSuccess(int guess, int num) {
        return guess == num;
    }

    public static void printTip(int guess, int num, int tryCount) {
        System.out.println(guess > num ? "Введенное число больше " : "Введенное число меньше ");
        System.out.println((tryCount - 1) > 0 ? " у вас осталось " + (tryCount - 1) + " попыток." : "Попытки закончились, вы проиграли.");
    }

    public static boolean wantToGame() {
        System.out.printf(
                "Повторить игру еще раз? %1$d – да / %2$d – нет»(%1$d – повторить, %2$d – нет)",
                NEXT_GAME,
                FINISH);
        return scanner.nextInt() == NEXT_GAME;
    }

    private static void guessNumber() {
        do {
            int num = generateRandomNumber();
            for (int tryCount = 3; tryCount > 0; tryCount--) {
                int guess = getUserGuess();
                if (isGuessSuccess(guess, num)) {
                    System.out.println("Вы угадали число!");
                    break;
                } else {
                    printTip(guess, num, tryCount);
                }
            }
        } while (wantToGame());
    }
}


