package OOP;

//Shows how abstract class and method works

public abstract class Appliance {

    public abstract void turnOn();
}
class Fan extends Appliance{

    @Override
    public void turnOn() {
        System.out.println("Device turns on!");
    }
}
class AC extends Appliance{

    @Override
    public void turnOn() {
        System.out.println("Device turns on!");
    }
}
class ApplianceMain{

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();

        AC ac = new AC();
        ac.turnOn();
    }
}
