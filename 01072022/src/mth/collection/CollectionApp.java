package mth.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionApp {

    public List<String> list;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        CollectionThread collectionThread = new CollectionThread(list);

        Thread thread = new Thread(collectionThread);
        thread.setDaemon(true);
        thread.start();

        new CollectionApp().printList(list);

    }

    private void printList(List<String> list) {

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
