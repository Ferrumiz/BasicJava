package homework5;

//Объявить двумерный массив, заполнить целыми числами и показать на экран.

public class ArraysWithNaturalNumbers {
    public static void main(String[] args) {
        int[][] arr1 = new int[10][10];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i*j;
            }
        }
        printArray(arr1);
    }

    private static void printArray(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
