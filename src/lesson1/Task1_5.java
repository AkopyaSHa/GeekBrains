package lesson1;

public class Task1_5 {
    public void printIsPositive(int a) {
        String isPositive = a < 0 ? "отрицательное" : "положительное";
        System.out.println("Число " + isPositive);
    }

    public static void main(String[] args) {
        Task1_5 task1_5 = new Task1_5();
        task1_5.printIsPositive(10);
        task1_5.printIsPositive(-10);
        task1_5.printIsPositive(0);
    }
}
