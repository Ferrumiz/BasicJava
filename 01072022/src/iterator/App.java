package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9);

        Iterator<Integer> iterator = list.iterator();
        iterator.next();
        iterator.remove();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
