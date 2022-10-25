//package inputoutputstream;
//
//import java.io.*;
//import java.util.Arrays;
//
//public class InputOutputApp {
//
//    //InputStream, OutputStream - потоки работающие с байтами
//    //Reader, Writer - абстрактные классы работающие с символами
//
//    public static void main(String[] args) {
//        String pathToFile = "F:\\Работа с Миськовым С.Д\\TelRan\\Homework\\BasicJava\\01072022\\src\\inputoutputstream\\testfile.txt";
//        String pathToOutputFile = "F:\\Работа с Миськовым С.Д\\TelRan\\Homework\\BasicJava\\01072022\\src\\inputoutputstream\\testfile2.txt";
//
//        try (FileInputStream inputStream = new FileInputStream(pathToInputFile)) {
//            FileOutputStream fileOutputStream = new FileOutputStream(pathToOutputFile);
//            int count = 0;
//
//            //Чтение по одному байту
//            /*
//            while (inputStream.available() > 0) {
//                int read = inputStream.read();
//                System.out.print((char) read + " ");
//                count++;
//            }
//            */
//
//            byte[] buffer = new byte[12];
//            /*
//            //Чтение с использованием массива байт
//            while (inputStream.available() > 0) {
//                int byteCounter = inputStream.read(buffer);
//                System.out.println("Read from file " + byteCounter);
//                System.out.println(Arrays.toString(buffer));
//                count++;
//            }
//             */
//
//            byte[] buffer = new byte[12];
//            //Чтение и запись с использованием массива байт
//            while (inputStream.available() > 0) {
//                int byteCounter = inputStream.read(buffer);
//                outputStream.write(buffer, 0, byteCounter);
//                System.out.println("Read from file " + byteCounter);
//                System.out.println(Arrays.toString(buffer));
//                count++;
//            }
//
//            //Чтение с использованием метода readAllBytes()
//            /*
//            while (inputStream.available() > 0) {
//                byte[] bytes = inputStream.readAllBytes();
//                System.out.println("Read from file " + bytes.length);
//                System.out.println(Arrays.toString(bytes));
//                count++;
//            }
//            */
//
//            System.out.println();
//            System.out.println(count);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found : " + pathToFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//
//
