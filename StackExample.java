package com.exam;


//Basic Operations of Stack:
//Push: To add an element to the stack, use the push() method. It places the element at the top of the stack.
//Pop: To remove and retrieve the top element, use the pop() method.
//Peek: To view the top element without removing it, use the peek() method.
//Search: To find the position of an element in the stack, use the search() method.
//basic structure of an empty Stack:
//Stack<Integer> stack = new Stack<Integer>();


import java.util.*;

class StackExample {

    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");
        for (int i = 0; i < 5; i++) {
            Integer y = stack.pop();
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = stack.search(element);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at position: " + pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
