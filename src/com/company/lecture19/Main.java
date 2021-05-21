package com.company.lecture19;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(12);
        stack.push(23);
        System.out.println(stack.pop());
        stack.push(56);
        stack.push(71);

        System.out.println(stack.pop());
        stack.push(83);
        System.out.println(stack.peek());

        Stack<Character> stack1 = new Stack<>();

    }
}
