package homework6;

//7.Введите с клавиатуры в List пять значений Integer. Выведите их в одну строку через запятую.
//Получите для List среднее арифметическое.

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        printDigits(arrayList, scanner);

    }

    private static void printDigits(ArrayList<Integer> arrayList, Scanner scanner) {
        System.out.println("Enter digits: ");
        for (int i = 0; i < 4; i++) {
            int digit = scanner.nextInt();
            arrayList.add(digit);
        }
        System.out.println(arrayList);

        int sum = 0;
        for (int i : arrayList) {
            sum += i;
        }
        System.out.println("Median: " + sum/4);
    }
}

