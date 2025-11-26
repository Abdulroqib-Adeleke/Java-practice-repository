package Conditional_Statement;

import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter student score: ");
        int gradePoint = scan.nextInt();
        
        if(gradePoint >= 90){
            System.out.println("Student grade is: A");
        }
        else if(gradePoint >= 80){
            System.out.println("Student grade is: B");
        }
        else if(gradePoint >= 70){
            System.out.println("Student grade is: C");
        }
        else if(gradePoint >= 60){
            System.out.println("Student grade is: D");
        }
        else if(gradePoint >= 50){
            System.out.println("Student grade is: E");
        }
        else {
            System.out.println("Student grade is: F");
        }
        scan.close();
    }
}
