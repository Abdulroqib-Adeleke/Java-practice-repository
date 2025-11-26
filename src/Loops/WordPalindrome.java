package Loops;

import java.util.Scanner;

public class WordPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a word: ");
        String input = scan.nextLine();
        String reverse ="";

        for(int i = 0; i < input.length(); i++){
            reverse += input.charAt(i);
        }

        if(input.equals(reverse))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println("Not a palindrome!");

        scan.close();
    }
}
