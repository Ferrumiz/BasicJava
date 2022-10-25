package propertyfilehomework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Scanner;

public class LoadAndPrintPropertyFile {

    public static void main(String[] args) throws IOException {
        LoadAndPrintPropertyFile app = new LoadAndPrintPropertyFile();
        app.printAll("C:\\Users\\ferru\\Desktop\\config.properties");

        System.out.println("Enter the path for output file : ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        System.out.println("XML file will be written to : " + path);

        app.writeToXml(path);

    }

    private Properties printAll(String filename) {
        try (InputStream input = new FileInputStream("C:\\Users\\ferru\\Desktop\\config.properties")) {
            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find " + filename);
                return null;
            }
            //Read a property list (key and element pairs) from the input byte stream
            prop.load(input);
            // Print key and values
            prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));
            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void writeToXml(String path) throws IOException {
        Properties props = new Properties();
        try (InputStream input =
                     new FileInputStream("C:\\Users\\ferru\\Desktop\\config.properties")) {
            // loads a properties file
            props.load(input);
        }

        try (OutputStream output =
                     new FileOutputStream(path)) {

            // convert the properties to an XML file
            props.storeToXML(output, "Server config file",
                    StandardCharsets.UTF_8);
        }
    }

}