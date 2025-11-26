package Loops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int input = scan.nextInt();

        for(int i = 0; i <= 24; i++){
            int result = input * i;
            System.out.println(input + " x " + i + " = " + result);
        }
        scan.close();
    }
}
