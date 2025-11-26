package Conditional_Statement;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price: ");
        double price = scan.nextDouble();
        System.out.println("Enter the discount in %: ");
        double discount = scan.nextDouble();
        discount = discount / 100;
        double discountPrice = price * discount;

        double payable = price - discountPrice;

        System.out.println("The payable amount is: " + payable);

        scan.close();
    }
}
