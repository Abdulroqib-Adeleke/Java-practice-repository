package TheBasics;

import java.util.Scanner;

public class CircleCalculation {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Give the radius of a circle: ");
        double radius = scan.nextDouble();

        double area = 3.14 * (radius * radius);
        System.out.println("The area of the circle is: " + area);

        double perimeter = 2 * 3.14 * radius;
        System.out.println("The perimeter of the circle is: " + perimeter);

        scan.close();
    }
}
