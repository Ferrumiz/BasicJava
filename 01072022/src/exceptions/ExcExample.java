package exceptions;

import java.io.*;

public class ExcExample {

    //Throwable - родитель всех исключений
    //      / \
    //  Error - критические ошибки, связанные с работой jvm, не рекомендуется обрабатывать
    //  Exception - исключения, которые можно и нужно обрабатывать
    //      Наследники класса Exception делятся на два типа - unckecked (все наследники класса RuntimeException) и checked - все остальные

    public static void main(String[] args) throws IOException {

//        int i = 10;
//        System.out.println(i / 0);

        try {
            String value = "adsssd";
            Integer integer = Integer.valueOf(value);
        } catch (NumberFormatException exception) {
            System.out.println("exception number format");
        } catch (Exception exception) {
            System.out.println("Exception other");
        }

        System.out.println("hello");

//        String path = "d:/test/test.txt";
//        String dataFromFile = getDataFromFile(path);
//
//    }
//
//    private static String getDataFromFile(String path) throws IOException {
//        BufferedReader reader = null;
//        reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
//        return reader.readLine();
   }
}

