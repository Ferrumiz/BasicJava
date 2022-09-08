package logparser;

import logparser.external.Message;
import logparser.model.OurMessage;
import logparser.model.User;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example {

    public static void main(String[] args) {

        int[] ints = {1, 6, 2, 8, 2, 3, 0};
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        String strOne = "one";
        String strTwo = "two";
        String strThree = "three";
        String[] strings = {strOne, strTwo, strThree};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


        User userOne = new User("AlexOne");
        User userTwo = new User("AlexTwo");
        User userThree = new User("AlexThree");

        Map<User, String> userStringMap = new TreeMap<>();
        userStringMap.put(userOne, "one");
        userStringMap.put(userTwo, "two");
        userStringMap.put(userThree, "three");

        System.out.println(userStringMap);

        //System.exit(0);

        User[] users = {userOne, userTwo, userThree};
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        Message messageOne = new OurMessage("1", 10);
        Message messageTwo = new OurMessage("2", 3);
        Message messageThree = new OurMessage("3", 5);


        Map<Message, String> messageMap = new TreeMap<>();
        messageMap.put(messageOne, "1");
        messageMap.put(messageTwo, "2");
        messageMap.put(messageThree, "3");

        System.out.println(messageMap);

    }
}
