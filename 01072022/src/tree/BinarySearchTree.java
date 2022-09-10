package tree;

import java.sql.Struct;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    private TreeNode root;

    public void add(int i) {
        root = addElement(root, i);
    }

    private TreeNode addElement(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (node.getValue() < value) {
            node.setRight(addElement(node.getRight(), value));
        }
        if (node.getValue() > value) {
            node.setLeft(addElement(node.getLeft(), value));
        }

        return node;
    }

    private boolean containsNode(TreeNode node, int value) {
        if (node == null) {
            return false;
        }
        if (node.getValue() == value) {
            return true;
        }

        int nodeValue = node.getValue();
        boolean isExist = false;
        if (nodeValue < value) {
            isExist = containsNode(node.getRight(), value);
        }
        if (nodeValue > value) {
            isExist = containsNode(node.getLeft(), value);
        }
        return isExist;
    }

    public boolean search(int i){
        return containsNode(root,i);
    }


    public void printTree() {
        if (root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i<size; i++){
                TreeNode node = queue.poll();
                System.out.print(" " +node.getValue());
                if(node.getLeft()!=null){
                    queue.offer(node.getLeft());
                }
                if(node.getRight()!=null){
                    queue.offer(node.getRight());
                }
            }
            System.out.println();
        }
    }
}
