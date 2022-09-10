package logparser.service;
import logparser.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  UserServiceImpl implements UserService {

    private List<User> userList;

    private void createUsers() {
        userList = new ArrayList<>();
        userList.add(new User("UserOne"));
        userList.add(new User("UserTwo"));
        userList.add(new User("UserThree"));
        userList.add(new User("UserFour"));
    }

    public UserServiceImpl(Scanner sc) {
        createUsers();
    }


    @Override
    public User getUserByName(String name) {
        for (User user :
                userList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}
