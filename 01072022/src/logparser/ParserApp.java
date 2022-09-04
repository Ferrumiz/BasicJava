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


import hashmap.Course;
import logparser.service.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ParserApp {

    public static void main(String[] args) throws FileNotFoundException {

        File LogList = new File("F:\\Работа с Миськовым С.Д\\TelRan\\Homework\\BasicJava\\01072022\\src\\logparser\\LogList");

        UserService userService = new UserServiceImpl();
        LogService logService = new LogServiceImpl(userService);
        logService.prepareStructure(new Scanner(LogList));

    }




}
