package TheBasics;

import java.util.Scanner;

public class ASCIIValue {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character to retrieve it ASCII value: ");
        char myChar = scan.next().charAt(0);

        int ascii = (int) myChar;
        System.out.println("The ASCII value is:" + ascii);

        scan.close();
    }
}
