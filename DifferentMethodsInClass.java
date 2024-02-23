package com.exam;

public class DifferentMethodsInClass {

    public static void main(String[] args) {

        greetings();

        int a = 20;
        int b = 10;
        int sum = add(a, b);
        System.out.println("The sum of a & b = " + sum);
        
        String m = "Dhaka";
        String n = "Bangladesh";
        String concatenatedString = add(m, n);
        System.out.println(m+" "+n); // I can Use (concatenatedString) to add  instead of m + " " + n

    }

    public static void greetings() {
        System.out.println("Hello Sumon");
    }

    public static int add(int a, int b) {
        return a + b;
    }
    
    public static String add(String Dhaka, String Bangladesh) {
        return Dhaka + " " + Bangladesh;
    }
}
