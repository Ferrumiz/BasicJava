package tree;

public class TreeExample {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(8);
        binarySearchTree.add(3);
        binarySearchTree.add(5);
        binarySearchTree.add(7);
        binarySearchTree.add(9);

        boolean exists = binarySearchTree.search(9);
        System.out.println(exists);

        binarySearchTree.printTree();

    }


}
