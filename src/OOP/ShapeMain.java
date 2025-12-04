package OOP;

abstract class Shape{
    public abstract double area();
}
class Circleq extends Shape{
    private double radius;

    public Circleq(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Square extends Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
public class ShapeMain {
    public static void main() {
        Circleq circleq = new Circleq(2);
        Square square = new Square(8);
        Triangle triangle = new Triangle(6, 8);

        System.out.println(circleq.area());
        System.out.println(square.area());
        System.out.println(triangle.area());
    }
}
