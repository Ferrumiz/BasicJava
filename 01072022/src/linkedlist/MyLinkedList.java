package linkedlist;

//First level: Написать свой класс LinkedList, только в отличие от штатной реализации, сделать его как Single Linked List,
//где каждый текущий элемент имеет ссылку только на следующий.
//Задать 5 элементов этого списка.


public class MyLinkedList {
    //Лучше переменную назвать firstNode
    private MyNode firstMy;


    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        MyNode myNodeFifth = new MyNode(5, null);// Задаем последнюю ноду, у нее ссылка на след элемент == null
        MyNode myNodeFirth = new MyNode(4, myNodeFifth);// Задаем предыдущую ноду, у нее ссылка на след элемент == пятому
        MyNode myNodeThird = new MyNode(3, myNodeFirth);// Задаем предыдущую ноду, у нее ссылка на след элемент == четвертому
        MyNode myNodeSecond = new MyNode(2, myNodeThird);// Задаем предыдущую ноду, у нее ссылка на след элемент == третьему
        MyNode myNodeFirst = new MyNode(1, myNodeSecond);// Задаем предыдущую ноду, у нее ссылка на след элемент == второму

        //теперь присвоим первую ноду в голову списка
        myLinkedList.firstMy = myNodeFirst;

        //Выведем LinkedList
        //Присвоим во временную ноду иначе после вывода в голове списка будет null
        //так как в цикле в текущий элемент присваиваем следующий
        MyNode curr = myLinkedList.firstMy;

        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.nextElement;
        }

    }

}
