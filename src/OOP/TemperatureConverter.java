package OOP;

public class TemperatureConverter {

    public double celsiusToFahrenheit(double temps){
        return temps * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double temps){
        return (temps - 32) * 5/9;
    }
}
class TempMain{

    public static void main(String[] args){

        TemperatureConverter convert = new TemperatureConverter();

        System.out.println(convert.celsiusToFahrenheit(32));
        System.out.println(convert.fahrenheitToCelsius(80));
    }
}
