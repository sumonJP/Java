package examquestion;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        int num, result;

//        indentify a number positive or negative
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        num = input.nextInt();

        if (num < 0) {
            System.out.println(num + " is a negative  number");

        } else if(num > 0) {
            System.out.println(num + " is a positive number");

        }else {
            System.out.println(num+" invalid");
        }

    }

}
