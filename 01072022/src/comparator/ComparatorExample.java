package comparator;

import logparser.model.Event;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {

        Event eventOne = new Event("google");
        Event eventTwo = new Event("yahoo");
        Event eventThree = new Event("yandex");
        Event eventFour = new Event("bing");


        Event[] events = {eventOne, eventTwo, eventThree, eventFour};

        Comparator<Event> comparator = new Comparator<>() {
            @Override
            public int compare(Event o1, Event o2) {
                return o1.getSource().compareTo(o2.getSource());
            }
        };

        ComparatorExample comparatorExample = new ComparatorExample();
        Map<Event, List<Event>> sortedEventsAsMap = comparatorExample.getSortedEventsAsMap(events, comparator);
        System.out.println(sortedEventsAsMap);

    }


    private Map<Event, List<Event>> getSortedEventsAsMap(Event[] events, Comparator comparator) {
        Map<Event, List<Event>> listMap = new TreeMap<>(comparator);
        for (Event event : events) {
            List<Event> eventList = new ArrayList<>();
            for (Event eventFromArray : events) {
                if (eventFromArray != event) {
                    eventList.add(eventFromArray);
                }
            }
            eventList.sort(comparator.reversed());
        }
        return listMap;

    }
}
