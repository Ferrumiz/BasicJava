package Cats;

import java.util.*;

public class CatMapsTask {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tom", 1, "black", true);
        Cat cat2 = new Cat("Tim", 2, "white", false);
        Cat cat3 = new Cat("Jerry", 1, "yellow", true);
        Cat cat4 = new Cat("Stepan", 3, "black", false);
        Cat cat5 = new Cat("Bob", 1, "black", false);
        Cat cat6 = new Cat("Jinny", 2, "grey", true);
        Cat cat7 = new Cat("Timmy", 4, "white", true);
        List<Cat> cats = Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7);


// 1. Получить Map<String, Boolean> имя / информация, голодна ли кошка
        Map<String, Boolean> nameInfoTable = task1(cats);
        System.out.println(nameInfoTable);


// 2. Получить Map<String, Long> цвет / количество кошек данного цвета
        Map<String, Long> colorInfoTable = task2(cats);
        System.out.println(colorInfoTable);

// 3. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
        Map<String, Set<String>> colorByNameTable = task3(cats);
        System.out.println(colorByNameTable);
    }

    private static Map<String, Long> task2(List<Cat> cats) {
        Map<String, Long> map = new HashMap<>(); //создаем мапу с ключем под цвет кота и значением под количество котов
        for (Cat cat : cats) { //перебираем список котов
            if (map.containsKey(cat.getColor())) { //если мапа уже содержит ключ с ранее добавленным в нее цветом, то
                long countCats = map.get(cat.getColor()); //берем сохраненное значение счетчика
                countCats++; //и добавляем единицу к этому значению
                map.put(cat.getColor(), countCats); //кладем цвет и счетчик в мапу
            } else { //для случая, если в мапе нет данного цвета, добавим цвет и счетчик в мапу
                long newCount = 0; //создаем новый счетчик
                newCount++; //добавляем единицу в счетчик
                map.put(cat.getColor(), newCount); //кладем цвет и счетчик в мапу
            }
        }
        return map;
    }

    private static Map<String, Set<String>> task3(List<Cat> cats) {
        Map<String, Set<String>> map = new HashMap<>(); //создаем мапу с ключем под цвет кота и значением под сет под имена котов
        for (Cat cat : cats) { //перебираем список котов
            if (map.containsKey(cat.getColor())) { //если мапа уже содержит ключ с ранее добавленным в нее цветом, то
                Set<String> set = map.get(cat.getColor()); //объявим переменную с именем set
                set.add(cat.getName()); //в эту переменную добавим текущее имя, содержащееся в переменной set
            } else { //для случая, если в мапе нет данного цвета, добавим цвет и кота в мапу
                Set<String> newSet = new HashSet<>(); //создадим новый сет, чтобы добавлять имена котов
                newSet.add(cat.getName()); //кладем в новый хешсет имя текущего кота
                map.put(cat.getColor(), newSet); //кладем в мапу новый цвет по ключу и имя по значению
            }
        }
        return map;
    }


    public static Map<String, Boolean> task1(List<Cat> cats) {
        Map<String, Boolean> map = new HashMap<>();
        for (Cat c : cats) {
            map.put(c.getName(), c.isHungry());
        }
        return map;
    }


}
