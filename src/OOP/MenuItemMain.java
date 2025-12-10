package OOP;

import java.util.ArrayList;

public class MenuItemMain {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Burger", 5.99);
        MenuItem fries = new MenuItem("Fries", 2.59);
        MenuItem soda = new MenuItem("Soda", 1.50);

        Cart cart = new Cart();
        cart.addMenuItem(burger);
        cart.addMenuItem(fries);
        cart.addMenuItem(soda);
        cart.addMenuItem(new MenuItem("Nugget", 9.99));

        cart.listMenu();
        System.out.println("Total: " + cart.calculateTotal());
    }
}
class MenuItem{
    private final String name;
    private final double price;

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " "+ price;
    }
}
class Cart{
    private final ArrayList<MenuItem> menu;

    public Cart(){
        menu = new ArrayList<>();
    }
    public void addMenuItem(MenuItem item){
        menu.add(item);
        System.out.println(item + " added to cart.");
    }

    public void listMenu(){
        if(menu.isEmpty()){
            System.out.println("Cart is empty.");
        }
        System.out.println("Items in cart:");
        for (MenuItem item : menu){
            System.out.println("- " + item);
        }
    }
    public double calculateTotal(){
        double total = 0;

        for (MenuItem item : menu){
            total += item.getPrice();
        }
        return total;
    }
}
