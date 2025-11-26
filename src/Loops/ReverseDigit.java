package Loops;

import java.util.Scanner;

public class ReverseDigit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = scan.nextInt();

        int reverse = 0;
        while(input != 0){
            int digit = input % 10;
            reverse = reverse * 10 + digit;
            input = input / 10;
        }
        System.out.println("the reverse is: " + reverse);

        scan.close();
    }
}
