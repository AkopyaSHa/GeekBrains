package lesson2;

public class Task2_4 {
    public static void main(String[] args) {
        int dimension = 5;

        int[][] arr = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if ((i == j) || (i == dimension - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
