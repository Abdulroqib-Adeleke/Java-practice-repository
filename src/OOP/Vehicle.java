package OOP;

public class Vehicle {

    public void startEngine(){
        System.out.println("Engine starts!");
    }
}
class Cars extends Vehicle{

}
class Bike extends Vehicle{

}
class VehicleMain{
    public static void main(String[] args){
        Cars cars = new Cars();
        Bike bike = new Bike();

        cars.startEngine();
        bike.startEngine();
    }
}
