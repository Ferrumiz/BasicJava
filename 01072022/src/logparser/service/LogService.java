package logparser.service;

import logparser.model.Event;
import logparser.model.User;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface LogService {

    //Start method
    //read data from file and prepare data structure

    Map<User, Map<String, List<Event>>> prepareStructure(Scanner sc) throws FileNotFoundException;
}
