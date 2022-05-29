/*
Conditions:
Implement the method that takes int[][] array and row index and
checks if the average of the elements in the row is greater than 0

Ход задачи:
сложить все числа массива
поделить сумму на количество элементов массива
 */
public class seekAverageGreaterThanZero {
    public static void main(String[] args) {
        int[][] arr = {{-7, 2, -8, 4, 6,3,9}, {-7, 0, 8, -9, -1, 5,7}};
        double sum = 0.0;
        double result = 0.0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int prev = arr[i][j];
                sum = sum + prev;
                result = sum / (arr.length * arr[0].length);
            }
        }
        if (result > 0) {
            System.out.println("the average is above zero");
        }
        else {
            System.out.println("the average is below zero");
        }
    }
}
