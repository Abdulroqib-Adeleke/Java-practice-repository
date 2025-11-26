package Conditional_Statement;

import java.util.Scanner;

public class ASimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first;
        int second;
        int result;

        System.out.println("Available operation: \n1. Add \n2. Subtract \n3. Multiply \n4. division" +
                "\nWhat operation are you performing?");
        int input = scan.nextInt();

        switch (input){
            case 1:
                System.out.println("Enter first number: ");
                first = scan.nextInt();
                System.out.println("Enter second number: ");
                second = scan.nextInt();
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;
            case 2:
                System.out.println("Enter first number: ");
                first = scan.nextInt();
                System.out.println("Enter second number: ");
                second = scan.nextInt();
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;
            case 3:
                System.out.println("Enter first number: ");
                first = scan.nextInt();
                System.out.println("Enter second number: ");
                second = scan.nextInt();
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;
            case 4:
                System.out.println("Enter first number: ");
                first = scan.nextInt();
                System.out.println("Enter second number: ");
                second = scan.nextInt();
                result = first / second;
                System.out.println(first + " / " + second + " = " + result);
                break;
            default:
                System.out.println("Not a valid operation!");
        }
        scan.close();
    }
}
