package Fundamentals;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteToAFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try(FileWriter writer = new FileWriter("log.txt")){
            System.out.println("Give a message");
            String inupt = scan.nextLine();
            writer.write(inupt + "\n");
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        scan.close();
    }
}
