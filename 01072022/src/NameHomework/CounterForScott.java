package NameHomework;

public class CounterForScott extends Thread {
    @Override
    public void run() {
        Human Scott = new Human();

        Scott.setName("Scott");

        for (int i = 0; i < 11; i++) {
            System.out.println(Scott.getName() + " " + i);
        }

    }
}

