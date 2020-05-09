package lesson1;

public class Task1_6 {

    public boolean math(int a) {
        return a >= 0;
    }

    public static void main(String[] args) {
        Task1_6 task1_6 = new Task1_6();
        System.out.println(task1_6.math(0));
        System.out.println(task1_6.math(-1));
        System.out.println(task1_6.math(2));
    }
}
