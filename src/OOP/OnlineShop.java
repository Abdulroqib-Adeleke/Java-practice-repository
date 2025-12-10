package OOP;

import java.util.*;

public class OnlineShop {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();


        items.add(new Electronics("Laptop", 1500));
        items.add(new Electronics("Headphone", 399));
        items.add(new Clothing("T-shirt", 400));
        items.add(new Clothing("Sweater", 599));

        for (Item item : items){
            System.out.println(item);
        }


    }
}

class Item{
    protected String name;
    protected double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    //5% tax
    public double calculateTax(){
        return price * 0.05;
    }

    @Override
    public String toString(){
        return name + " - price: " + price + ", tax: " + calculateTax();
    }

}
class Electronics extends Item{

    public Electronics(String name, double price) {
        super(name, price);
    }

    //15% tax
    //electronic have higher tax due to VAT or import duties
    @Override
    public double calculateTax(){
        return price * 0.15;
    }
}
class Clothing extends Item{

    public Clothing(String name, double price) {
        super(name, price);
    }

    //8% tax
    @Override
    public double calculateTax(){
        return price * 0.08;
    }
}
