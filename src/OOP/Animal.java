package OOP;

public class Animal {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog goes: " + dog.makeSound());
        System.out.println("Cat makes : " + cat.makeSound() + " sound");
    }
}
class Dog{

    public String makeSound(){
        return "Bark!";
    }
}
class Cat{

    public String makeSound(){
        return "Meow!";
    }
}
