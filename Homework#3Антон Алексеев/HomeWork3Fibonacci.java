public class HomeWork3Fibonacci {

    public static void main(String[] args) {
        printFirstNFibonacciNumbers(10); // must print numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

    }

    public static void printFirstNFibonacciNumbers(int n) {
        int previousVal = 0;
        int nextVal = 1;
        for (int count = 0; count < n / 2; count++) {
            System.out.print(previousVal + ", ");
            previousVal = nextVal + previousVal;
            // Чтобы программа не выводила по 2 числа,
            // тут должен быть цикл для второй переменной с выходом в верхний цикл for.
            // Как это сделать?
            System.out.print(nextVal + ", ");
            nextVal = previousVal + nextVal;
        }
    }
}


