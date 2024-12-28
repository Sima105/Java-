// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class 1
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

// Child Class 2
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Access methods from all levels of the inheritance chain
        myDog.eat();   // From Animal
        myDog.walk();  // From Mammal
        myDog.bark();  // From Dog
    }
}
