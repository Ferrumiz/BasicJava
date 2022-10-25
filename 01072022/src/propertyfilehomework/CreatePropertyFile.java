package propertyfilehomework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreatePropertyFile {

    public static void main(String[] args) {

        try (OutputStream output = new FileOutputStream("C:\\Users\\ferru\\Desktop\\config.properties")) {

            Properties prop = new Properties();


            // set the properties value
            prop.setProperty("db.url", "localhost");
            prop.setProperty("db.user", "mkyong");
            prop.setProperty("db.password", "password");
            prop.setProperty("db.ID", "11111");
            prop.setProperty("db.value", "7");

            // save properties to project root folder
            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
