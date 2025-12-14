package TheBasics;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the principal: ");
        double principal = scan.nextDouble();
        System.out.println("Give the rate(%): ");
        double rate = scan.nextDouble();
        rate = rate/100;
        System.out.println("Give the duration (Time): ");
        double time = scan.nextDouble();

        double result = principal * rate * time;
        System.out.println("Th simple interest is: " + result);

        scan.close();
    }
}
