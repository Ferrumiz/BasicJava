package stack.homework;

public class MyApp {
    private static NewNode first;

    public static void main(String[] args) {

        MyNewStack myNewStack = new MyNewStack();

        myNewStack.push(5);
        myNewStack.push(3);
        myNewStack.pop();
        myNewStack.push(4);
        myNewStack.push(1);

        myNewStack.printStack();
        System.out.println(myNewStack.peek());

    }
}
