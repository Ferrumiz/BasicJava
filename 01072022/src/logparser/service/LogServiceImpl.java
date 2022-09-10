package logparser.service;

import logparser.model.Action;
import logparser.model.ActionState;
import logparser.model.Event;
import logparser.model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LogServiceImpl implements LogService {

    private Map<User, List<Event>> userEventList = new HashMap<>();

    private Map<User, Map<String, List<Event>>> userEventListByDate = new HashMap<>();

    private UserService userService;

    private EventService eventService;

    public LogServiceImpl(UserService userService, EventService eventService) {
        this.userService = userService;
        this.eventService = eventService;
    }

    @Override
    public Map<User, Map<String, List<Event>>> prepareStructure(Scanner sc) throws FileNotFoundException {
        readInputData();
        groupEventByDate(userEventList.keySet());
        return userEventListByDate;
    }


    private void readInputData() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("F:\\Работа с Миськовым С.Д\\TelRan\\Homework\\BasicJava\\01072022\\src\\logparser\\LogList"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Map<User, Event> pair = createEventFromString(line);
            addDataToUserEventList(pair);
        }
    }

    private Map<User, Event> createEventFromString(String line) {
        Map<User, Event> map = new HashMap<>();
        String[] data = line.split(" ");
        User user = userService.getUserByName(data[1]);
        Event event = eventService.createEvent();
        event.setSource(data[0]);
        event.setDate(data[2]);
        event.setDestination(data[3]);
        event.setAction(Action.valueOf(data[4]));
        event.setState(ActionState.valueOf(data[5]));
        map.put(user, event);

        return map;
    }

    private void addDataToUserEventList(Map<User, Event> map) {
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry<User, Event> pair : map.entrySet()) {
            User user = pair.getKey();
            Event event = pair.getValue();

            if (userEventList.containsKey(user)) {
                List<Event> events = userEventList.get(user);
                events.add(event);
            } else {
                List<Event> eventList = new ArrayList<>();
                eventList.add(event);
                userEventList.put(user, eventList);
            }
        }
    }

    private void groupEventByDate(Set<User> users) {
        for (User user : users) {
            Map<String, List<Event>> dateEventMap = new HashMap<>();
            List<Event> eventList = userEventList.get(user);
            Set<String> dateSet = new HashSet<>();
            for (Event event : eventList) {
                dateSet.add(event.getDate());
            }
            for (String date : dateSet) {
                List<Event> eventByDate = new ArrayList<>();
                for (Event event : eventList) {
                    if (event.getDate().equals(date)) {
                        eventByDate.add(event);
                    }
                }
                dateEventMap.put(date, eventByDate);
            }
            userEventListByDate.put(user, dateEventMap);
        }
    }
}

