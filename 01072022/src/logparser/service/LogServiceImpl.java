package logparser.service;

import logparser.model.Action;
import logparser.model.ActionState;
import logparser.model.Event;
import logparser.model.User;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class LogServiceImpl implements LogService {

    //STRUCTURE

    private UserService userService;

    public LogServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void prepareStructure(Scanner sc) {
        //Read file and get string

        String userName = "UserOne";
        //User userByName = userService.getUserByName(userName);

        HashMap<Event, HashMap<Event, Event>> dateMap = new HashMap<>();
        HashMap<Event, Event> actionMap = new HashMap<>();

        while (sc.hasNextLine()) {
            String logString = sc.nextLine();
            String[] logArray = logString.split(" ");



            //System.out.println(Arrays.toString(logArray));

            Event event = new Event();
            event.setSource(logArray[0]);
            event.setDate(logArray[2]);
            event.setDestination(logArray[3]);
            event.setAction(Action.valueOf(logArray[4]));
            event.setState(ActionState.valueOf(logArray[5]));




            //System.out.println(event.getSource());
            //userMap.put(new User(logArray[1]), dateMap);
            //dateMap.put(Event.getDate(), actionMap);
            //actionMap.put(action, null);
        }

    }

}

