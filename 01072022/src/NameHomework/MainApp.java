package NameHomework;

// Создать класс, в котором должен быть метод, выводящий в цикле содержимое
// переменной name + счетчик (от 0 до 10). Создать несколько экземпляров (3-4),
// с разными значениями name. Запустить все в разных нитях. Посмотреть что получилось.

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        CounterForMary counterForMary = new CounterForMary();
        CounterForJack counterForJack = new CounterForJack();
        CounterForScott counterForScott = new CounterForScott();
        CounterForSusan counterForSusan = new CounterForSusan();

        counterForMary.start();
        counterForJack.start();
        counterForScott.start();
        counterForSusan.start();

    }

}
