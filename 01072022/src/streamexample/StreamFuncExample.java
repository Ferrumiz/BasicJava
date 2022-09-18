package streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFuncExample {

    public static void main(String[] args) {

        int varOne = 10;
        int varTwo = 20;
        //Варианты создания объекта на основе функц. интерфейса:
        //1 - с использованием доп. класса
        CalculateImpl calculate = new CalculateImpl();
        calculate.sum(varOne, varTwo);

        //2 - создаем объект анонимного класса, который
        // имплементирует этот интерфейс и тут же делаем реализацию.
        Calculate calculateOne = new Calculate() {
            @Override
            public int sum(int varOne, int varTwo) {
                return (varOne + varTwo) * 2;
            }
        };
        calculateOne.sum(varOne, varTwo);

        //3 - используем лямбда - выражение

        //3.1 - работаем с самим объектом
        Calculate calculateTwo = (var1, var2) -> (var1 + var2) * 2;
        calculateTwo.sum(varOne, varTwo);

        //3.2 - в качестве сокращения передаем чистую лямбду
        StreamFuncExample streamFuncExample = new StreamFuncExample();
        streamFuncExample.calculateSum(varOne, varTwo, (var1, var2) -> (var1 + var2) * 2);

        //3.3 - в качестве сокращения вызываем метод у объекта:
        StreamFuncExample streamFuncExampleOne = new StreamFuncExample();
        streamFuncExample.calculateSum(varOne, varTwo, (var1, var2) -> streamFuncExampleOne.calculateTotal(var1, var2));

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("three");
        stringList.add("two");

        List<String> collect = stringList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        List<String> collectOne = stringList.stream().filter(el -> el.contains("o"))
                .collect(Collectors.toList());
        System.out.println(collectOne);
    }

    private int calculateSum(int v1, int v2, Calculate calculate) {
        return calculate.sum(v1, v2);
    }

    private int calculateTotal(int v1, int v2) {
        int sum = v1 + v2;
        return (sum) * 2;
    }

}
