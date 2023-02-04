package mth.collection;

import java.util.List;

public class CollectionThread implements Runnable {

    public List<String> list;

    public CollectionThread(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            list.add("new element");
        }
    }
}
