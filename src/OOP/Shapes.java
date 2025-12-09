package OOP;

public abstract class Shapes {
    public abstract double area();
}

interface Drawable{
    void draw();
}
class CircleTwo extends Shapes implements Drawable{
    private final double radius;

    public CircleTwo(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class SquareTwo extends Shapes implements Drawable{
    private final double side;

    public SquareTwo(double side){
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
class TriangleTwo extends Shapes implements Drawable{
    private final double base;
    private final double height;

    public TriangleTwo(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    public void draw(){
        System.out.println("Drawing a triangle");
    }
}
class ShapesMain{

    public static void main(String[] args) {
        CircleTwo cir = new CircleTwo(7);
        SquareTwo squ = new SquareTwo(5);
        TriangleTwo triTwo = new TriangleTwo(4,7);

        System.out.println(cir.area());
        cir.draw();

        System.out.println(squ.area());
        squ.draw();

        System.out.println(triTwo.area());
        triTwo.draw();
    }
}
