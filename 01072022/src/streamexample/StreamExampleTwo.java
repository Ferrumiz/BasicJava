package streamexample;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleTwo {

    public static void main(String[] args) {
        //distinct() - intermediate выкидывает дубли из набора данных
        //count() - terminal подсчитывает количество элементов в наборе данных

        //filter - intermediate позволяет фильтровать стрим по условию.
        //collect(Collectors.toList) - собирает стрим в выбранную коллекцию.

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("three");
        stringList.add("two");

        List<String> collect = stringList.stream().distinct().collect((Collectors.toList()));
        System.out.println(collect);

        List<String> collectOne = stringList.stream().filter(el->el.contains("o")).collect(Collectors.toList());
        System.out.println(collectOne);

        List<String> collectTwo = stringList.stream().filter(s -> s.contains("o")).filter(s -> s.contains("t")).collect(Collectors.toList());
        System.out.println(collectTwo);


        System.exit(0);


        List<String> strings = stringList.stream().filter(element -> element.contains("o"))
                .filter(element -> element.contains("t"))
                .collect(Collectors.toList());
        System.out.println(strings);

    }

    private boolean func(String element) {
        return element.contains("o");
    }
}
