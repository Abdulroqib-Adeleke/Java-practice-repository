package Package1;
import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());

        days = days * (60*60*24);
        System.out.println(days);

    }
}
