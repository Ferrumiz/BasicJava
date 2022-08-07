package overload;

import Cars.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[0];
        int[] ints = new int[0];
        Car[] cars = new Car[0];

        printArray(ints);
        printArray(strings);
        printArray(cars);

        print(strings);
        print(strings,10);

    }

    private static void printArray(String[] strings) {
        System.out.println(Arrays.toString(strings));
    }

    private static void printArray(int[] ints) {
        System.out.println(Arrays.toString(ints));
    }

    private static void printArray(Car[] cars) {
        System.out.println(Arrays.toString(cars));
    }


    public static void print(String[] strings) {
        print(strings, 0);
    }

    public static void print(String[] strings, int size) {
        System.out.println(Arrays.toString(strings));
        System.out.println(size);
    }
}
