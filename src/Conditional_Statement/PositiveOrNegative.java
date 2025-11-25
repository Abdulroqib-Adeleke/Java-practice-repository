package Conditional_Statement;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int nums = scan.nextInt();

        if(nums > 0)
            System.out.println(nums + " is a positive number");
        else if (nums < 0)
            System.out.println(nums + " is a negative number");
        else
            System.out.println(nums + " is neutral");

        scan.close();
    }
}
