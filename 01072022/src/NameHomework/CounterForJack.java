package NameHomework;

public class CounterForJack extends Thread {
    @Override
    public void run() {
        Human Jack = new Human();

        Jack.setName("Jack");

            for (int i = 0; i < 11; i++) {
                System.out.println(Jack.getName() + " " + i);
            }

    }
}


