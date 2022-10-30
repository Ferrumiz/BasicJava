package mth;

public class WaitExampleApp {
    public static String inputData = null;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        ConsoleReader consoleReader = new ConsoleReader();
        consoleReader.start();

        ApartFileWriter apartFileWriter = new ApartFileWriter();
        apartFileWriter.start();

        apartFileWriter.join();
        System.out.println("Bye!");
    }
}
