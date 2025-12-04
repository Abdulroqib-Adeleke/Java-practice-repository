package OOP;

public class Box {
    public static void main(String[] args){
        BoxAttribute box1 = new BoxAttribute();
        BoxAttribute box2 = new BoxAttribute(20);
        BoxAttribute box3 = new BoxAttribute(20,5,12);

        System.out.println(box1.toString());
        System.out.println(box2.toString());
        System.out.println(box3.toString());
    }
}
class BoxAttribute{
    private int length;
    private int height;
    private int width;

    //Default constructor
    public BoxAttribute(){
    }

    //Constructor overloading
    public BoxAttribute(int length){
        this.length = length;
    }

    //Constructor overloading
    public BoxAttribute(int length, int height, int width){
        this.length = length;
        this.height = height;
        this.width = width;
    }
    public String toString(){
        return "Length: " + this.length + ", height: " + this.height + ", width: " + this.width;
    }
}
