package mth;

import java.io.FileWriter;
import java.io.IOException;
import static mth.WaitExampleApp.inputData;

public class ApartFileWriter extends Thread {
    @Override
    public void run() {
        String path = "F:/Работа с Миськовым С.Д/TelRan/Homework/BasicJava/01072022/src/mth/file.txt";
        try (FileWriter writer = new FileWriter(path)) {
            while (true) {
                Thread.sleep(2);
                if (inputData != null) {
                    if ("exit".equals(inputData)) {
                        break;
                    }
                    writer.write(inputData);
                    writer.flush();
                    inputData = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
        }
    }
}
