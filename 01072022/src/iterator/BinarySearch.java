package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, 1, 2, 4, 5, 6, 7, 9, 13, 15, 21, 25, 28));
        //-5, 1, 2, 4, 5, 6, 7, 9, 13, 15, 21, 25, 28  l=0,r=12
        //9, 13, 15, 21, 25, 28  l=7, r=12
        //9, 13, 15  l=7, r=9
        //9, 13  l=7, r=8
        //9 l=7, r=7

        int target = 13;
        BinarySearch binarySearch = new BinarySearch();
        int i = binarySearch.binarySearch(list, target);
        System.out.println("index = " + i);
    }



    private int binarySearch(List<Integer> list, int target) {
        int count = 0;
        int left = 0;
        int right = list.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int value = list.get(mid);//опр. серединный индекс первого эл-та.
            if (list.get(mid) == target) {      //сравнить, не яв-ся ли данный эл-т. искомым
                return mid;
            }
            if (value > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}