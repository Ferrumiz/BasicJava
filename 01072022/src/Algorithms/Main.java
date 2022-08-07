package Algorithms;

public class Main {
    public static void main(String[] args) {
        System.out.println(SleepIn(false, false));
        System.out.println(SleepIn(true, false));
        System.out.println(SleepIn(false, true));
        System.out.println(BackAround("Hello"));
        ReverseArray();
        FactorArray();
        System.out.println(SortCar(4, 3));
    }

    public static boolean SleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static String BackAround(String str) {
        String last = str.substring(str.length() - 1);
        return ReplaceStr(last + str);
    }

    public static String ReplaceStr(String str) {
        return str.replace("o", "a");
    }

    public static void ReverseArray() {
        String[] words = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        String temp;
        int lengthArr = words.length;
        //Переворачиваем массив
        for (int i = 0; i < lengthArr / 2; i++) {
            temp = words[lengthArr - i - 1]; // берем последний элемент массива
            words[lengthArr - i - 1] = words[i];// записываем первый элемент в последний
            words[i] = temp;// записываем последний в первый элемент
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void FactorArray() {
        int index = 1 + (int) (Math.random() * 10); //рандомим длину массива., где: 1 = от скольки. 10 = до скольки.
        // int тип
        int[] mas1 = new int[index];
        int[] mas2 = new int[index];

        for (int i = 0; i < index; i++) { // рандомим числа в самом массиве
            mas1[i] = 1 + (int) (Math.random() * 10);
            mas2[i] = 1 + (int) (Math.random() * 10);
        }
        int number1 = 1;
        int number2 = 1;

        for (int i = 0; i < index; i++) {
            number1 *= mas1[i];
            number2 *= mas2[i];
        }
        System.out.println(number1 + number2);
        for (int i = 0; i < index; i++) {
            System.out.println("Первый " + mas1[i] + " Второй " + mas2[i]);
        }
    }

    public static String SortCar(int carWh, int carRed) {
        if (carRed == 0 || carWh == 0) {
            return "Машин мало";
        }
        if (carWh > carRed) {
            if (carRed * 2 < carWh) {
                return "Белых много";
            }
            boolean flag = carWh - carRed == 1;
            int a = 0;
            if (flag) {
                a = 1;
            }
            for (int i = 0; i < carWh - a; i++) {
                System.out.print("W");
                if (i % 2 == 0 && !flag) {
                    System.out.print("R");
                }
                if (flag) {
                    System.out.print("R");
                }
            }
            if(flag){
                System.out.println("W");
            }
        } else if (carWh < carRed) {
            if (carWh * 2 < carRed) {
                return "Красных много";
            }
        }
        return " ";
    }
}






