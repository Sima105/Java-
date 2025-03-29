
//just for test

abstract class Vehicle {
    abstract void start();
    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with a key...");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is starting with a self-start button...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); 
        myCar.stop();  

        Vehicle myBike = new Bike();
        myBike.start(); 
        myBike.stop();  
    }
}
