package stack.homework;

// First level: Написать свой класс Stack(назвать как удобнее) в котором, в качестве структуры
// хранения данных использовать класс Node по аналогии с LinkedList.
// Класс должен иметь методы push,pop,peek,empty , а также метод printStack который может
// выводить все содержимое стека в консоль, начиная с вершины стека и до его начала.

import linkedlist.MyLinkedList;
import linkedlist.MyNode;

import java.util.Stack;

public class MyStack extends Stack {
    private static NewNode firstMy;
    //Лучше переменную назвать firstNode

    public static void main(String[] args) {

        MyStack myLinkedList = new MyStack();
        NewNode myNodeFifth = new NewNode(5, null);// Задаем последнюю ноду, у нее ссылка на след элемент == null
        NewNode myNodeFirth = new NewNode(4, myNodeFifth);// Задаем предыдущую ноду, у нее ссылка на след элемент == пятому
        NewNode myNodeThird = new NewNode(3, myNodeFirth);// Задаем предыдущую ноду, у нее ссылка на след элемент == четвертому
        NewNode myNodeSecond = new NewNode(2, myNodeThird);// Задаем предыдущую ноду, у нее ссылка на след элемент == третьему
        NewNode myNodeFirst = new NewNode(1, myNodeSecond);// Задаем предыдущую ноду, у нее ссылка на след элемент == второму

        //теперь присвоим первую ноду в голову списка
        MyStack.firstMy = myNodeFirst;

        //Выведем LinkedList
        //Присвоим во временную ноду иначе после вывода в голове списка будет null
        //так как в цикле в текущий элемент присваиваем следующий
        NewNode curr = MyStack.firstMy;

        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.nextElement;
        }

    }

}
