package etc;

public class Application {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 9, 3, 8, 0, 4, 2, 1, 3, 5, 7};
        double sum = 0;

        for (int i = arr.length-1 ; i >= 0; i--) {                     //цикл "for" для перебора элементов массива в обратном порядке.
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        for (int element : arr) {                                      //цикл  "for each" помогает, когда надо последовательно перебрать все элементы массива
            System.out.print(" " + element);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" index =" + i + ", value=" + arr[i]); //в этом случае цикл "for each " не применим,
                                                                   // т.к значение переменной "i" не будет вычислено
        }
        //цикл для вычисления ср.арифметического массива:
        for (int i = arr.length-1 ; i >= 0; i--) {                     //цикл "for" для перебора элементов массива в обратном порядке.
            System.out.print(" " + arr[i]);
            sum = sum + arr[i];                                        //переменная для хранения суммы элементов массива
        }
        double result = sum/ arr.length;                    //переменная для хранения результата вычисления ср.арифметического
        System.out.println(" result = " + result);
    }
}
