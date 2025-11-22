package LoopsAndSwitch;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        int fact = 1;

        System.out.println("Give a number: ");
        int input = scan.nextInt();

        while(i <= input){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial: " + fact);

        scan.close();
    }

}
