package logparser.service;

import logparser.model.*;

import java.util.*;

//First level: Взять несколько объектов типа Event.
//Поля есть в данном классе, написать компараторы для
//трех четырех полей, такие что бы каждый отличался друг
//от друга логикой сравнения, придумать свою.
//Написать метод, принимающий массив объектов, компаратор
//и возвращающий отсортированную структуру данных, в которой
//объекты из переданного массива будут являться ключом,
//а значением будут являться список со всеми остальными
//объектами, кроме этого отсортированными в порядке обратном
//переданному компаратору.

public class LogComparator {

    Event event1 = new Event();
    Event event2 = new Event();
    Event event3 = new Event();
    Event event4 = new Event();

    Event[] events = {event1, event2, event3, event4};

    Comparator<Event> stateComparator = new Comparator<Event>() {
        @Override
        public int compare(Event o1, Event o2) {
            return o1.getState().compareTo(o2.getState());
        }
    };

    Comparator<Event> actionComparator = new Comparator<Event>() {
        @Override
        public int compare(Event o1, Event o2) {
            return o1.getAction().compareTo(o2.getAction());
        }
    };

    Comparator<Event> sourceComparator = new Comparator<Event>() {
        @Override
        public int compare(Event o1, Event o2) {
            return o1.getSource().compareTo(o2.getSource());
        }
    };


    private Map<Event, List<Event>> compareBySource(Event[] events, Comparator comparator) {
        Map<Event, List<Event>> map = new HashMap<>();
        for (Event event : events) {
            List<Event> eventList = new ArrayList<>();
            eventList.add(events);
            eventList.sort(sourceComparator.reversed());
            map.put(event, (List<Event>) eventList);
        }
        return map;
    }
}
