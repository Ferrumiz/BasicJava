package logparser;

import logparser.model.Log;

import java.util.Arrays;
import java.util.Comparator;

public class ExampleComparator {
    public static void main(String[] args) {
        Log google = new Log("google", 10);
        Log google1 = new Log("google", 5);
        Log google2 = new Log("google", 2);
        Log google3 = new Log("google", 11);

        Log yahoo = new Log("yahoo", 5);
        Log yahoo1 = new Log("yahoo", 1);
        Log yahoo2 = new Log("yahoo", 20);
        Log yahoo3 = new Log("zamazon", 3);


        Log[] logs = {google, google1, google2, google3, yahoo, yahoo1, yahoo2, yahoo3};

        Comparator<Log> logComparator = new Comparator<Log>() {
            @Override
            public int compare(Log o1, Log o2) {
                return Integer.compare(o1.getCount(), o2.getCount());
            }
        };

        Comparator<Log> comparatorString = new Comparator<Log>() {
            @Override
            public int compare(Log o1, Log o2) {
                return o1.getAddress().
                        compareTo(o2.getAddress());
            }
        };

        Arrays.sort(logs, logComparator);
        Arrays.sort(logs, comparatorString);
        System.out.println(Arrays.toString(logs));

        System.out.println("Last position : " + new ExampleComparator().getLastLog(logs, logComparator));
        System.out.println("Last position : " + new ExampleComparator().getLastLog(logs, Comparator.naturalOrder()));

    }

    private Log getLastLog(Log[] logs, Comparator comparator) {
        Arrays.sort(logs, comparator);
        return logs[logs.length - 1];
    }

}
