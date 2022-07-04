package com.telran.project;

public class app {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,2,9,1,5,7,2};
        double sum = 0;
        for (int i = arr.length-1; i > 0; i--) {
            System.out.print(" " + arr[i]);
            sum = arr[i] + sum;
        }
        System.out.println("result = " + sum/ arr.length);

        /*
        for (int element : arr ) {
            sum = element + sum;
            System.out.print(sum);
        }
        */




    }
}
