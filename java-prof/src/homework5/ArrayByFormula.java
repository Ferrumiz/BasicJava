package homework5;

//Создать двумерный массив.
// Заполнить его элементами, каждый из которых вычисляется по формуле: a[i,j] =7*i-3*j. Вывести массив на экран.

public class ArrayByFormula {
    public static void main(String[] args) {
        int[][] arr1 = new int[10][10];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = 7*i-3*j;
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
