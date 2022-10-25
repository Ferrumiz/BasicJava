package Algorythms;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(5);
        nums.push(6);
        nums.push(7);
        nums.push(8);
        nums.push(9);
        nums.push(10);

        System.out.println(nums.empty());
        System.out.println(nums.peek());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());

    }
}
