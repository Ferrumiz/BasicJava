package mth;

import java.util.Scanner;

public class ConsoleReader extends Thread {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (!"exit".equals(WaitExampleApp.inputData)) {
            WaitExampleApp.inputData = scanner.nextLine();

        }
        scanner.close(); 
    }
}
