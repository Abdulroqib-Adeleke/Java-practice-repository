package Loops;


import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Start: to start \nQuit: to quit");
        String input = scan.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(101);

        while (true){
            if(input.equals("Quit")){
                System.out.println("Bye");
                break;
            } else if (input.equals("Start")) {
                System.out.println("Guess the number between 1 and 100: ");
                int guess = scan.nextInt();
                if (guess == randomNumber){
                    System.out.println("You guessed right!");
                    break;
                }else {
                    System.out.println("Try again: ");
                }
            }
        }
        scan.close();
    }
}
