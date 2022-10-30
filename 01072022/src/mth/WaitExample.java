package mth;

public class WaitExample {
    public static int summ = 0;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        ConsoleReader consoleReader = new ConsoleReader();
        consoleReader.start();

        ApartFileWriter apartFileWriter = new ApartFileWriter();
        apartFileWriter.start();

        System.out.println("Bye!");
    }

}
