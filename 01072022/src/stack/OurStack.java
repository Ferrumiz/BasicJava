package stack;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class OurStack<E> extends Stack<E> {

    private ArrayList<E> stack;

    public OurStack() {
        this.stack = new ArrayList<>(); //проинициализируем некое хранилище данных для каждого нового объекта типа OurStack
    }

    public E push(E element) {     //метод, который добавляет элемент стэк на последнее место
        stack.add(element);             //по умолчанию в ArrayList все переменные добавляются последними
        return element;
    }

    public E peek() {                //метод позволяет взять элемент из стэка, посмотреть его,
        if (stack.isEmpty()) {         // но при этом этот метод также хранится (когда смотрим на кучу бумаг, видим верхний лист)
            throw new IllegalArgumentException();
        }
        return stack.get(stack.size() - 1);
    }

    public E pop() {                 //метод, который уберет последний элемент(верхний лист) и откроет доступ к нижележащему элементу
        if (stack.isEmpty()) {
            throw new IllegalArgumentException();
        }
        E character = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return character;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
