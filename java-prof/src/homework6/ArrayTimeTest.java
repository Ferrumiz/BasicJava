package homework6;

import java.util.ArrayList;
import java.util.LinkedList;

//5. Напишите метод, который добавляет 1 000 000 элементов в ArrayList и LinkedList.
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
//Как замерить время:
//long before = System.currentTimeMillis();
//здесь написать код выполнения
//long after = System.currentTimeMillis();
//System.out.println(after - before);

public class ArrayTimeTest {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1_000_000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println("time to get element from arrayList: " + (System.currentTimeMillis() - startTime)*.001 + " s.");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println("time to get element from linkedList: " + (System.currentTimeMillis() - startTime)*.001 + " s.");
    }
}

