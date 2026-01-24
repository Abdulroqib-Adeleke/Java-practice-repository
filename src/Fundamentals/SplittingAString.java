package Fundamentals;

import java.util.Scanner;

public class SplittingAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a sentence");
        String input = scan.nextLine();

        String[] part = input.split(" ");
        for (String s : part) {
            System.out.println(s);
        }
    }
}
