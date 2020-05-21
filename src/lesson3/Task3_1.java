package lesson3;

        import java.util.Scanner;
        import java.util.Random;

public class Task3_1 {
    public static void main(String[] args) {
        guessNumber();
    }
    private static Random random = new Random();

    private static void guessNumber() {
        Scanner scanner = new Scanner(System.in);

        do {
            int num = random.nextInt(10);
            System.out.println("Угадай число с 3 попыток от 0 до 9");

            for (int i = 3; i > 0; i--) {
                System.out.println("Введи свой ответ:");
                int questionNum = scanner.nextInt();
                if (questionNum == num) {
                    System.out.println("Вы угадали число!");
                    break;
                }
                System.out.println(questionNum > num ? "Введенное число больше " : "Введенное число меньше ");
                System.out.println((i - 1) > 0 ? " у вас осталось " + (i - 1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }
}
