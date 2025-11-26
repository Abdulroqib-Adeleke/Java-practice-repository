package Loops;

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give digit: ");
        int num = scan.nextInt();
        int count = 0;

        while(num != 0){
            count++;
            num /= 10;
        }
        System.out.println("number of digits: " + count);

        scan.close();
    }
}
