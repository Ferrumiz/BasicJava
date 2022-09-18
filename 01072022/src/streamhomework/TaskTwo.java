package streamhomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {

    public static void main(String[] args) {

        TaskTwo taskTwo = new TaskTwo();

        Integer[] array = {4, 1, 4, 6, 8, 9, 0, 3, 1, 5, 4, 6, 2, 3};

        //Напишем аналогичный метод, использующий стримы:
        int value = 5; //задаем переменную, определяющую выводимые значения

        List<Integer> collect = Arrays.stream(array)
                .filter(e -> e < value)
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(taskTwo.getIntegerList(array, 5));

    }

    //Данный метод возвращает элементы массива, которые меньше значения "value"
    private List getIntegerList(Integer[] array, int value) {
        List integerList = new ArrayList<>();
        for (int i : array) {
            if (i < value) {
                integerList.add(i);
            }
        }
        return integerList;
    }
}
