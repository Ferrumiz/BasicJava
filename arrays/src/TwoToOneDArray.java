/*
Conditions:
Implement the method that takes a two-dimensional array and
return the single-dimensional array with all elements of the given array
({ {1,2},{3,4},{5,6} }) -> {1,2,3,4,5,6}

Ход задачи:
взять элементы 2д массива
преобразовать их в числа
вывести числа на экран
 */
public class TwoToOneDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i==0 && j==0) {
                    System.out.print("{");
                }
                System.out.print(arr[i][j]);
                System.out.print(",");
                if (i==2 && j==1) {
                    System.out.print("}");
                }
            }
        }
    }
}
