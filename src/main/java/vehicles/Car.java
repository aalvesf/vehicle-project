package vehicles;

public class Car extends Vehicle {
    public Engine CarEngine;
    public Car(String make, String model, int speed, Engine CarEngine) {
        super(make, model, speed);
        this.CarEngine = new CarEngine();
    }
}

