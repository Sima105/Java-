class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("The cat meows.");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        Animal myAnimal = new Cat(); 
        myAnimal.sound();
        myAnimal.sound();
    }
}
