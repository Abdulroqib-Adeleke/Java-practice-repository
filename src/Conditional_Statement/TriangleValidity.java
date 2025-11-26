package Conditional_Statement;

import java.util.Scanner;

public class TriangleValidity {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first angle: ");
        int first = scan.nextInt();

        System.out.println("Enter the second angle: ");
        int second = scan.nextInt();

        System.out.println("Enter the third angle: ");
        int third = scan.nextInt();

        int result = first + second + third;

        if(result == 180)
            System.out.println("It is a valid triangle");
        else
            System.out.println("Not a valid triangle");

        scan.close();
    }
}
