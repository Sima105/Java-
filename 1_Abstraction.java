//Just to test

abstract class Animal {
    abstract void sound(){
    void sleep() {
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); 
        Animal cat = new Cat(); 

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}
