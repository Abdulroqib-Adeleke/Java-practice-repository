package OOP;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuItemFromAFile {
    public static void main(String[] args) {

        Carts carts = new Carts();

        carts.addMenuItem();

        carts.listMenu();
        System.out.println("Total: " + carts.calculateTotal());
    }
}
class MenuItems{
    private final String name;
    private final double price;

    public MenuItems(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " $"+ price;
    }
}
class Carts{
    private final ArrayList<MenuItems> menu;

    public Carts(){
        menu = new ArrayList<>();
    }
    public void addMenuItem(){
        try(Scanner scan = new Scanner(Paths.get("food_items.txt"))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                String[] part = row.split(" ");
                String name = part[0];
                double price = Double.parseDouble(part[1]);
                menu.add(new MenuItems(name,price));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void listMenu(){
        if(menu.isEmpty()){
            System.out.println("Cart is empty.");
        }
        System.out.println("Items in cart:");
        for (MenuItems item : menu){
            System.out.println("- " + item);
        }
    }
    public double calculateTotal(){
        double total = 0;

        for (MenuItems item : menu){
            total += item.getPrice();
        }
        return total;
    }
}
