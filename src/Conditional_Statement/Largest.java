package Conditional_Statement;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scan.nextInt();
        System.out.println("Enter second number: ");
        int second = scan.nextInt();
        System.out.println("Enter third number: ");
        int third = scan.nextInt();

        if(first > second && first > third)
            System.out.println(first + " is the largest");
        else if(first < second && second > third)
            System.out.println(second + " is the largest");
        else
            System.out.println(third + " is the largest");

        scan.close();
    }
}
