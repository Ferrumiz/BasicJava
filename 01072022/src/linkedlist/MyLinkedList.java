package linkedlist;

import java.util.LinkedList;

public class MyLinkedList {

    int sizeOfMyLinkedList = 0;
    MyNode firstMy;
    MyNode nextMy;

    public static void main(String[] args) {

        System.out.println(linkFirstElement( 2));
    }

    public MyLinkedList() {
    }

    private void linkFirstElement(MyNode e) {
        final MyNode f = firstMy;
        final MyNode newMyNode = new MyNode(e, f);
        firstMy = newMyNode;
        if (e == null) {
            e.thisElement = newMyNode;
            sizeOfMyLinkedList++;
        }
    }

    private void linkLastElement(MyNode e) {
        final MyNode l = nextMy;
        final MyNode newMyNode = new MyNode(e, null);
        nextMy = newMyNode;
        if (e == null) {
            firstMy = newMyNode;
        }else{
                l.nextElement = newMyNode;
            sizeOfMyLinkedList++;
        }
    }


    class MyNode {

        MyNode thisElement;
        MyNode nextElement;

        public MyNode(MyNode firstElement, MyNode nextElement) {
            this.thisElement = firstElement;
            this.nextElement = nextElement;
        }

    }
}