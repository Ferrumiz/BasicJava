package streamexample;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("three");
        stringList.add("two");

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("one", "one");
        stringMap.put("two", "two");
        stringMap.put("three", "three");

        //How to create stream ?
        //That's how:

        //1
        Stream<String> streamFromList = stringList.stream();
        Stream<Map.Entry<String, String>> stream = stringMap.entrySet().stream();
        Stream<String> valuesStream = stringMap.values().stream();
        Stream<String> keysStream = stringMap.keySet().stream();

        //2 From array
        String[] strings = {"one", "two", "three"};
        Stream<String> streamFromArray = Arrays.stream(strings);

        //3 From set of data
        Stream<String> streamOfData = Stream.of("one", "two", "three");

        //4 From string
        String oneString = "one";
        IntStream chars = oneString.chars();

        //5 Empty stream
        Stream<Object> empty = Stream.empty();

        //6 For mth
        Stream<String> stringStream = stringList.parallelStream();

        //Type of operators:
        //1. Intermediate - returns stream (many)
        //2. Terminal(final) - returns Object, null, primitive, collection (one)
        //Important: terminal must always be present in the end of operators.

        //Object result = collection . create stream . intermadiate . terminal operator;

        //Object result = list.stream().int1.int2.int3.int4.term1;

        //Write a method that returns a number of unique objects from string
        StreamExample streamExample = new StreamExample();
        int uniqueCount = streamExample.getUniqueCount(stringList);
        System.out.println("Count without double " + uniqueCount);


        int[] nums = {3, 4, 6, 3, 5, 6, 7, 3, 4, 5};
        long count = Arrays.stream(nums).distinct().count();

    }

    private int getUniqueCount(List<String> stringList) {
        Set<String> stringSet = new HashSet<>();
        for (String element : stringList) {
            stringSet.add(element);
        }

        return stringSet.size();
    }

    private int getUniqueCountByStream(List<String> stringList) {

        long count = stringList.stream().count();

        Stream<String> distinct = stringList.stream().distinct();

        return (int) stringList.stream().distinct().count();

        //distinct() - intermediate operator (returns a new stream with no duplicates)
        //count() - terminal operator (Returns the count of elements in this stream)
    }

}
