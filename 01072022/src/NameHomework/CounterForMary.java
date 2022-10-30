package NameHomework;

// Создать класс, в котором должен быть метод, выводящий в цикле содержимое
// переменной name + счетчик (от 0 до 10). Создать несколько экземпляров (3-4),
// с разными значениями name. Запустить все в разных нитях. Посмотреть что получилось.

public class CounterForMary extends Thread {
    @Override
    public void run() {
        Human Mary = new Human();

        Mary.setName("Mary");

        for (int i = 0; i < 11; i++) {
            System.out.println(Mary.getName() + " " + i);
        }

    }
}

