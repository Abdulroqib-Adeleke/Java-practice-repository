package TheBasics;


import java.util.Scanner;

public class TempsConversion {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double cels;
        double fahren;

        System.out.println("Converting from celsius to fahrenheit");
        System.out.println("Give temperature in celsius");
        cels = scan.nextDouble();
        double result = cels * 1.8 + 32;
        System.out.println(result + " fahrenheit");

        System.out.println("---------");

        System.out.println("Converting from fahrenheit to celsius");
        System.out.println("Give temperature in fahrenheit");
        fahren = scan.nextDouble();
        double resultF = (fahren - 32) * 5/9;
        System.out.println(resultF + " celsius");

        scan.close();
    }
}
