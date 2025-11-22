package Conditional_Statement;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int first;
        int second;

        System.out.println("Commands: \nStart \nEnd");
        System.out.println("Enter command:");
        String command = scan.nextLine();

        if(command.equals("End")){
            System.out.println("Bye");
        }

        if(command.equals("Start")){
            System.out.println("Available operation: \nAdd \nSubtract \nMultiply " +
                    "\nWhat operation are you performing?");
            String input = scan.nextLine();

            if(input.equals("Add")){
                System.out.println("Enter first number");
                first = scan.nextInt();

                System.out.println("Enter second number");
                second = scan.nextInt();

                int sum = first + second;
                System.out.println(first + " + " + second + " = " + sum);
            }
            else if(input.equals("Subtract")){
                System.out.println("Enter first number");
                first = scan.nextInt();

                System.out.println("Enter second number");
                second = scan.nextInt();

                int result = first - second;
                System.out.println(first +  " - " + second + " = " + result);
            }
            else if(input.equals("Multiply")){
                System.out.println("Enter first number");
                first = scan.nextInt();

                System.out.println("Enter second number");
                second = scan.nextInt();

                int result = first * second;
                System.out.println(first +  " * " + second + " = " + result);
            }
        }
        scan.close();
    }
}
