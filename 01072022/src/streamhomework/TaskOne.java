package streamhomework;

import java.util.*;
import java.util.stream.Collectors;

public class TaskOne {

    public static void main(String[] args) {

        int[] ints = {7, 9, 11, 2, 5, 8, 13};

        char[] chars = {4, 3, 4, 7, 8, 9};

        List<String> stringList = new ArrayList<>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(4);
        integerList.add(4);
        integerList.add(5);

        long count = Arrays.stream(ints).distinct().count();
        System.out.println(count);

        List<String> collectStrings = stringList.stream()
                .distinct()
                .filter(e -> e.contains("r"))
                .collect(Collectors.toList());
        System.out.println(collectStrings);

        long collectInts = integerList.stream()
                .distinct().count();
        System.out.println(collectInts);

    }
}
