package OOP;

public class AreaCalculation {

    public static void main(String[] args){
        Area area = new Area();

        System.out.println("Area of circle: " + area.areaOfACircle(7));
        System.out.println("Area of square: " + area.areaOfASquare(7));
        System.out.println("Area of circle: " + area.areaOfARectangle(7,4));
    }
}

class Area{

    public double areaOfACircle(double radius){
        return 3.14 * (radius * radius);
    }

    public double areaOfASquare(double side){
        return side * side;
    }

    public double areaOfARectangle(double length, double width){
        return length * width;
    }
}
