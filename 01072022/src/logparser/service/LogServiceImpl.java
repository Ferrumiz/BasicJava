package logparser.service;

import logparser.model.Event;

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

        HashMap<String, HashMap<String, HashMap<String, String>>> userMap = new HashMap<>();
        HashMap<String, HashMap<String, String>> dateMap = new HashMap<>();
        HashMap<String, String> actionMap = new HashMap<>();

        while (sc.hasNextLine()) {
            String logString = sc.nextLine();
            String[] logArray = logString.split(" ");
            String source = logArray[0];
            String name = logArray[1];
            String date = logArray[2];
            String destination = logArray[3];
            String action = logArray[4];
            String actionSource = logArray[5];

            userMap.put(name, dateMap);
            dateMap.put(date, actionMap);
            actionMap.put(action, null);
        }

    }

}

