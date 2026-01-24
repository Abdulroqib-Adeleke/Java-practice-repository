package Fundamentals;

import java.util.Scanner;

public class Input {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a string: ");
        String input = scanner.nextLine();

        System.out.println("Enter an integer value:");
        int val = scanner.nextInt();

        System.out.println("Word entered is: " + input + "\nInteger = " + val);

        scanner.close();
    }
}
