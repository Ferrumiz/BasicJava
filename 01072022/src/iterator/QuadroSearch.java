package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadroSearch {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(30, 22, 21, 14, 13, 11, 7, 9, 1, -15, -21, -25, -28));

        int target = 21;

        QuadroSearch binarySearch = new QuadroSearch();
        int i = binarySearch.binarySearch(list, target);
        System.out.println("i= " + i);

        QuadroSearch quadroSearch = new QuadroSearch(); //числа 7 и 9 не определяются этим методом. Почему пока не разобрался.
        System.out.println(quadroSearch.quadroSearch(list, i));
    }

    int binarySearch(List<Integer> list, int target) {
        int count = 0;
        int left = 0;
        int right = list.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int value = list.get(mid);                  //опр. серединный индекс первого эл-та.
            if (list.get(mid) == target) {              //сравнить, не яв-ся ли данный эл-т. искомым
                return mid;
            }
            if (value > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    String quadroSearch(List<Integer> list, int i) {
        int left = 0;
        int right = list.size() - 1;
        int mid = (list.size() - 1) / 2;

        while (i >= 0) {
            if (i == left) {
                return "Искомое число является граничным значением слева";
            }
            if (i == right) {
                return "Искомое число является граничным значением справа";
            }
            if (i <= mid) {
                return "Искомое число находится в левой части от середины массива";
            }
            if (i > mid) {
                return "Искомое число находится в правой части от середины массива";
            }
        }
        return "Такого числа в массиве нет";
    }
}


