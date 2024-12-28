interface Animal {
    void eat();
}
interface Pet {
    void play();
}
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("The dog eats food.");
    }
    public void play() {
        System.out.println("The dog plays fetch.");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.play();
    }
}
