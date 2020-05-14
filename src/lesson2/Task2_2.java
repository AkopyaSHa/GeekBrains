package lesson2;

public class Task2_2 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int step = 3;
        array[0] = 0;

        for (int i = 1; i < array.length; i++) {
            int previous = array[i - 1];
            array[i] = previous + step;
            System.out.print(array[i] + " ");
        }
    }
}
