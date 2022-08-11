package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 4, 6, 7, 9, 11));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-4, -2, 2, 5, 7, 5, 11, 14, 16));

        List<Integer> result = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < (list1.size() + list2.size()); i++) {
            if (i1 >= list1.size() && i2 < list2.size()) {
                result.add(list2.get(i2++));
                continue;
            }
            if (i2 >= list1.size() && i1 < list2.size()) {
                result.add(list1.get(i1++));
                continue;
            }
            if (list1.get(i1) <= list2.get(i2)) {
                result.add(list1.get(i1++));
            } else {
                result.add(list2.get(i2++));
            }
        }
        System.out.println(result);
    }
}
