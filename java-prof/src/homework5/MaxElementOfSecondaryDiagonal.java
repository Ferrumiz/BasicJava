package homework5;

import java.util.Arrays;

//Найти максимальный элемент побочной диагонали (cлайд 14 поможет)

public class MaxElementOfSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] arr1 = new int[10][10];
        int[] arr2 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i * j;
                if (i == arr1.length - j - 1) {
                    arr2[i] = arr1[i][j];
                }
            }
        }
        printArray1(arr1);
        printArray2(arr2);
        sortArray2(arr2);
    }

    private static void printArray1(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printArray2(int[] arr2) {
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static void sortArray2(int[] arr2) {
        System.out.println();
        Arrays.sort(arr2);
        printArray2(arr2);
    }
}
