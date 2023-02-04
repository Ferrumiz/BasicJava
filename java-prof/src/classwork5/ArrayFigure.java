package classwork5;

//С помощью двумерных массивов напечатайте на консоль следующую фигуру (массив 8 на 8)
//- подсказка подумайте над четностью номера колонки и строки

public class ArrayFigure {
    public static void main(String[] args) {
        int[][] arr1 = new int[10][10];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if ((i + j) % 2 == 0){
                    arr1[i][j] = 0;
                }else {
                    arr1[i][j] = 1;
                }
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
