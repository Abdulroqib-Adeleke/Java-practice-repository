package Conditional_Statement;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int nums = scan.nextInt();

        if(nums%2 == 0){
            System.out.println(nums + " is an even number");
        }
        else
            System.out.println(nums + " is an odd number");

        scan.close();
    }
}
