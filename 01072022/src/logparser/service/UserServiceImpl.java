package logparser.service;

import logparser.model.Event;
import logparser.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService{

    private List<User> userList;

    public UserServiceImpl(Scanner sc) {
        //Call method to create test data
        HashMap<User, HashMap<Event, HashMap<Event, Event>>> userMap = new HashMap<>();

        while (sc.hasNextLine()) {
            String logString = sc.nextLine();
            String[] logArray = logString.split(" ");

            userMap.put(logArray[2], datemap);
        }
    }


    @Override
    public User getUserByName(String name) {
        for (User user:
             userList) {
            if(user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}
