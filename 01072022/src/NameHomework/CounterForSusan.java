package NameHomework;

public class CounterForSusan extends Thread {
    @Override
    public void run() {
        Human Susan = new Human();

        Susan.setName("Susan");

        for (int i = 0; i < 11; i++) {
            System.out.println(Susan.getName() + " " + i);
        }
    }
}
