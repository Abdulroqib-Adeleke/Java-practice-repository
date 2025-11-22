package Conditional_Statement;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Set speed limit: ");
        int limit = scan.nextInt();

        System.out.println("Give current speed: ");
        int speed = scan.nextInt();

        if(speed > limit){
            System.out.println("Speeding ticket!");
        }else{
            System.out.println("Below speed limit");
        }
        scan.close();
    }
}
