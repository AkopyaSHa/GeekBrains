package lesson3;

import java.util.Scanner;
import java.util.Random;

public class Task3_2 {
    private static int MAX_LENGTH = 15;
    private static Random random = new Random();

    private static String getRandomFruit() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        return words[random.nextInt(words.length - 1)];
    }

    private static void guessWord() {

        String word = getRandomFruit();
        System.out.println("Я загадал фрукт (не более 15 букв), попробуй отгадать его");
        System.out.println(word);

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
            String answer = scanner.nextLine();
            answer = answer.substring(0, Math.min(answer.length(), MAX_LENGTH));

            if (answer.equals("")) break;

            if (word.equals(answer)) {
                System.out.println("Вы угадали слово, игра закончена!!!");
                break;
            } else {
                System.out.println(getTip(answer, word));
            }
        } while (true);
    }


    public static String getTip(String answer, String word) {
        char[] charMarks = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        for (int i = 0; i < Math.min(answer.length(), word.length()); i++) {
            if (word.charAt(i) == answer.charAt(i)) charMarks[i] = answer.charAt(i);
        }
        return new String(charMarks);
    }

    public static void main(String[] args) {
        guessWord();
    }
}
