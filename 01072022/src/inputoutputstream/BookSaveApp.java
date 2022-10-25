//package inputoutputstream;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//public class BookSaveApp {
//
//    public static void main(String[] args) {
//
//
//        Book book = null;
//        String pathToFile = "F:\\Работа с Миськовым С.Д\\TelRan\\Homework\\BasicJava\\01072022\\src\\inputoutputstream\\testfile";
//
//        BookSaveApp bookSaveApp = new BookSaveApp();
//        if (args[0].equals("1")) {
//            book = new Book("Book One", "Author one", 155);
//            bookSaveApp.save(book, pathToFile);
//        }
//
//        if (args[0].equals("2")) {
//            Book load = bookSaveApp.load(pathToFile);
//        }
//
//        System.out.println(book);
//    }
//
//    private void save(Book book, String path) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(book.getName()).append("_")
//                .append(book.getAuthor()).append("_")
//                .append(book.getPagesCount()).toString().getBytes();
//        try (FileInputStream outputStream = new FileInputStream(path)) {
//            outputStream.write(outputData);
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    private Book load(String path) {
//        byte[] bytes = new byte[0];
//        try (FileInputStream inputStream = new FileInputStream(path)) {
//            bytes = inputStream.readAllBytes();
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }
//        String inputData = new String(bytes);
//        String[] strings = inputData.split("_");
//        Integer.valueOf(4);
//        new Book(strings[0], strings[1], Integer.valueOf(strings[2]));
//
//        return null;
//    }
//}
