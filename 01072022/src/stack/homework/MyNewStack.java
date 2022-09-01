package stack.homework;
import java.util.LinkedList;
import java.util.Stack;

// First level: Написать свой класс Stack(назвать как удобнее) в котором, в качестве структуры
// хранения данных использовать класс Node по аналогии с LinkedList.
// Класс должен иметь методы push,pop,peek,empty , а также метод printStack который может
// выводить все содержимое стека в консоль, начиная с вершины стека и до его начала.


public class MyNewStack<E> extends Stack<E> {

    private LinkedList<E> stack;

    public MyNewStack() {
        this.stack = new LinkedList<>();
    }

    public E push (E element) {
        stack.addLast(element);
        return element;
    }

    public E peek () {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return stack.getLast();
    }

    public E pop() {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException();
        }
        E character = stack.getLast();
        stack.removeLast();
        return character;
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public void printStack() {
        System.out.print(stack);
        System.out.println();
    }
}
