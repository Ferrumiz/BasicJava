package linkedlist;

//First level: Написать свой класс LinkedList, только в отличие от штатной реализации, сделать его как Single Linked List,
//где каждый текущий элемент имеет ссылку только на следующий.
//Задать 5 элементов этого списка.


public class MyLinkedList {

    int sizeOfMyLinkedList = 0;
    MyNode firstMy;
    MyNode nextMy;

    public static void main(String[] args) {

        System.out.println(linkFirstElement(2));
    }

    public MyLinkedList() {
    }

    private void linkFirstElement(MyNode e) {

        final MyNode f = firstMy;
        final MyNode newMyNode = new MyNode(e, f);

        firstMy = newMyNode;
            e.thisElement = newMyNode; //Тут возникла проблема с приведением типов. Не понимаю как решить.
            sizeOfMyLinkedList++;
        }


    private void linkLastElement(MyNode e) {

        final MyNode l = nextMy;
        final MyNode newMyNode = new MyNode(e, null);
        nextMy = newMyNode;

        if (e == null) {
            firstMy = newMyNode;
        } else {
            l.nextElement = newMyNode;
            sizeOfMyLinkedList++;
        }
    }


    class MyNode {

        int thisElement;
        MyNode nextElement;

        public MyNode(int firstElement, MyNode nextElement) {
            this.thisElement = firstElement;
            this.nextElement = nextElement;
        }

    }
}