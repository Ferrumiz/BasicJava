package mth;

import java.nio.file.Files;
import java.nio.file.Path;

public class OutputPrinter extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}

