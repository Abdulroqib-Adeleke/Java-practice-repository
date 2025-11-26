package Loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        System.out.println("Give a number: ");
        int num = scan.nextInt();

        while(count <= num){
            sum += count;
            count++;
        }
        System.out.println("The sum is: " + sum);
    }
}
