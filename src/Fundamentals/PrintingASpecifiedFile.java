package Fundamentals;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which file should have it content printed? ");
        String input = scan.nextLine();

        try(Scanner sc = new Scanner(Paths.get(input))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
