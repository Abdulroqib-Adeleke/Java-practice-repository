package OOP;

public class Circle {
    private double radius;

    public Circle(){}

    public double area(double radius){
        return 3.14 * (radius * radius);
    }

    public double circumference(double radius){
        return 2 * 3.14 * radius;
    }
}
class CircleMain{
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println(circle.area(1.3));
        System.out.println(circle.circumference(1.3));
    }
}
