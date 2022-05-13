public class SumOfDivisibleByThreeNumbers {
    public static void main(String[] args) {
        getSumDivisibleByTreeNumbers(10, 20);
    }

    public static void getSumDivisibleByTreeNumbers(int num1, int num2) {
        int i = num1;               // переменная для шага цикла
        int buff = 0;               // буферная переменная
        int sum = 0;                // переменная для суммы на следующем витке цикла
        while (i <= num2) {         // пока первое число <= второго
            if (i % 3 == 0) {       // и если первое число делится на 3 нацело
                buff = i;           // буферная переменная = i
                sum = buff + sum;   // сумма = буферная переменная + предыдущее значение суммы
            }
            i = i + 1;              // берем следующее целое число
        }
        System.out.println(sum);    // по выходу из цикла while выводим сумму чисел, удовлетворяющих нашим условиям
    }
}
