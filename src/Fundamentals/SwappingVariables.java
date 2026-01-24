package Fundamentals;

import java.util.Scanner;

public class SwappingVariables {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scan.nextInt();
        System.out.println("Enter second number: ");
        int second = scan.nextInt();

        System.out.println("The numbers are now: \nFirst: " + first +"\nSecond: " + second);

        int swap = first;
        first = second;
        second = swap;

        System.out.println("------");
        System.out.println("Swapped");
        System.out.println("The numbers are: \nFirst: " + first +"\nSecond: " + second);

        scan.close();
    }
}
