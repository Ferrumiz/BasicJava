package transferobject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileApp {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("F:\\Работа с Миськовым С.Д\\TelRan\\Homework\\BasicJava\\01072022\\src\\transferobject\\testfile");

        List<String> stringList = Files.readAllLines(path);

    }
}
