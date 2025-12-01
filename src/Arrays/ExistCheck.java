package Arrays;

import java.util.Scanner;

public class ExistCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 29;
        numbers[2] = 34;
        numbers[3] = 4;
        numbers[4] = 107;
        numbers[5] = 38;
        numbers[6] = 70;
        numbers[7] = 45;
        numbers[8] = 11;
        numbers[9] = 10;

        System.out.println("Enter value: ");
        int input = scan.nextInt();
        boolean exist = false;

        for (int number : numbers) {
            if (input == number) {
                exist = true;
                break;
            }
        }
        if(exist)
            System.out.println(input + " exist!");
        else
            System.out.println(input +" does not exist");

        scan.close();
    }
}
