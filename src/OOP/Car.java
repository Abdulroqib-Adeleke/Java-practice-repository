package OOP;

public class Car {
    private final String brand;
    private final String model;
    private final int year;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String toString(){
        return "Brand: " + this.brand + ", model: " + this.model + ", year: " + this.year;
    }
}

class Main{
    public static void main(String[] args){
        Car car1 = new Car("BMW", "M5CS", 2020);
        Car car2 = new Car("BMW", "M4CSL", 2024);
        Car car3 = new Car("BMW", "M2CS", 2025);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}
