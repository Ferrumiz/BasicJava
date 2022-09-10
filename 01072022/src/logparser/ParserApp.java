package logparser;

/*
Пример лога:

127.0.0.1 UserOne 01.09.2022 google.com REQUEST OK     //REQUEST, RESPONSE, DOWNLOAD, UPLOAD  //OK,FAIL, PAUSE
127.4.0.1 UserTwo 30.08.2022 google.com REQUEST FAIL
127.4.0.1 UserTwo 30.08.2022 google.com RESPONSE FAIL
127.4.0.1 UserFour 30.08.2022 google.com DOWNLOAD OK

////////
UserOne -> 30.08.2022 , 01.09.2022

30.08.2022 -> (event 1, event 2)

01.09.2022 -> (event 1, event 2)

UserTwo

///////

*/


import logparser.model.Event;
import logparser.model.User;
import logparser.service.*;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ParserApp {

    public static void main(String[] args) throws FileNotFoundException {

        File logList = new File("F:\\Работа с Миськовым С.Д\\TelRan\\Homework\\BasicJava\\01072022\\src\\logparser\\LogList");

        UserService userService = new UserServiceImpl(new Scanner(logList));
        EventService eventService = new EventServiceImpl();
        LogService logService = new LogServiceImpl(userService, eventService);
        logService.prepareStructure(new Scanner(logList));
        Map<User, Map<String, List<Event>>> userMapMap = logService.prepareStructure(new Scanner(logList));

//        List<String> eventListForUser;
//        User currentUser;
//        List<Event> eventList;
//        List<Date> dateListForCurrentUser;
//        List<Event> eventByDate;
//        Map<Date, List<Event>> dateListMap;
//        Map<User, Map<String, List<Event>>> userLogs;

    }

}
