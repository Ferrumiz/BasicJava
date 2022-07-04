/*
    1. Реализовать метод boolean isEven(int number) который возвращает true если
        переданное число четное иначе возвращает false.
        Реализовать метод void printCheckResultMessage(int number, boolean result)
        который выводит на экран строку вида «10 это четное число» или “15 это не четное число»
        Подсказка: Используем конструкцию if и оператор % modulo
    2. Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
        true если number1 делится на number2 без остатка. Аналогично первой задаче реализовать
        метод печати результата.
    3. Реализовать метод, который в качестве параметров получает
        3 числа типа инт. Метод должен возвращать true если и первое и второе число делятся без
        остатка на третье. Подсказка: Используйте метод, написанный в пункте 2
    4. Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
        наибольшее из трех переданных чисел: Например: max3(10,19,0) -> 19
    5. Реализовать метод String longestString (String str1, String str2, String str2) который возвращает
        самую длинную строку из трех заданных строк: Подсказка: Используйте метод, написанный
        в пункте 4 Например: longestString (“java”,”welcome”,”hello”) -> “welcome”


public class Conditions {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(isEven(number));
        int number1 = 4;
        int number2 = 3;
        System.out.println(isDivisible(number1, number2));
        int number3 = 10;
        int number4 = 15;
        int number5 = 5;
        System.out.println(isDivisibleByThird(number3, number4, number5));
        int num1 = -500;
        int num2 = 700;
        int num3 = 3127;
        System.out.println(maxVal(num1, num2, num3));
        String s1 = "hello";
        String s2 = "welcome";
        String s3 = "java";
        System.out.println(longestString(s1,s2,s3));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDivisible(int number1, int number2) {
        if (number1 % number2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDivisibleByThird(int number3, int number4, int number5) {
        if ((number3 % number5 == 0) && (number4 % number5 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int maxVal(int num1, int num2, int num3) {
        int max = 0;
            if ((num1 < num2)) {
                max = num2;
                if (max < num3) {
                    max = num3;
                }
            }
            else {
                max = num1;
            }
        return max;
        }
        public static String longestString (String s1, String s2, String s3){
            String longest;
            if ((s1.length() < s2.length())) {
                longest = s2;
                if (longest.length() < s3.length()) {
                    longest = s3;
                }
            }
            else {
                longest = s1;
            }
            return longest;
        }
    }
*/



