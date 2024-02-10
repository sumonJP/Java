package examquestion;

import java.util.Scanner;

public class SumAndAvgOf5Subject {

    public static void main(String[] args) {

        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Bangla: ");
        int sub1 = scanner.nextInt();

        System.out.print("Enter number of English: ");
        int sub2 = scanner.nextInt();
        System.out.print("Enter number of Math: ");
        int sub3 = scanner.nextInt();

        System.out.print("Enter number of Science: ");
        int sub4 = scanner.nextInt();
        System.out.print("Enter number of ICT: ");
        int sub5 = scanner.nextInt();

        sum = sub1 + sub2 + sub3 + sub4 + sub5;

        int average = sum / 5;

        System.out.println("Sum of five subject's numbers= " + sum);
        System.out.println("Average of five subject's numbers= " + average);

    }

}
