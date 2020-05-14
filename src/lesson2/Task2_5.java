package lesson2;

public class Task2_5 {
    public static void main(String[] args) {
            int[] arr = {2, 6, 4, 1, 12, -2, 6, 2, -7, 10};
            int min = arr[0];
            int max = arr[0];
            System.out.print("В массиве: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }

            for (int i = 0; i < arr.length; i++) {
                min = (min < arr[i]) ? min : arr[i];
                max = (max > arr[i]) ? max : arr[i];
            }
            System.out.println("\nМинимальный элемент: " + min + "\nМаксимальный элемент: " + max);
        }
    }
