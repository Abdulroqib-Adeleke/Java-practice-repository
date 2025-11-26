package Conditional_Statement;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a character: ");
        char myChar = scan.nextLine().charAt(0);

        switch (myChar){
            case 'a', 'e', 'i', 'u', 'o':
                System.out.println(myChar + " is a vowel");
                break;
            default:
                System.out.println(myChar + " is a consonant");
        }
        scan.close();
    }
}
