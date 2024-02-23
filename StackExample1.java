
package com.exam;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Print the stack
        System.out.println("Stack: " + stack);

        // Pop an element from the stack
        String s1 = stack.pop();
        System.out.println("Popped Element: " + s1);

        // Print the updated stack
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element without removing it
        String s2 = stack.peek();
        System.out.println("Top Element: " + s2);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty: " + isEmpty);

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Stack Size: " + size);
    }
}

