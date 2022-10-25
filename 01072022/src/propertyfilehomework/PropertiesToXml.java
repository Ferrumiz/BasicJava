package propertyfilehomework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesToXml {

    public static void main(String[] args) {


    }

    public void writeToXml() throws IOException {
        Properties props = new Properties();
        try (InputStream input =
                     new FileInputStream("C:\\Users\\ferru\\Desktop\\config.properties")) {
            // loads a properties file
            props.load(input);
        }

        try (OutputStream output =
                     new FileOutputStream("C:\\Users\\ferru\\Desktop\\server-config.xml")) {

            // convert the properties to an XML file
            props.storeToXML(output, "Server config file",
                    StandardCharsets.UTF_8);
        }
    }

}