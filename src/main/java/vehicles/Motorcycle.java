package vehicles;

public class Motorcycle extends Vehicle{
    public boolean hasSideCar;
    public Engine MotorcycleEngine;

    public Motorcycle(String make, String model, int speed, boolean hasSideCar, Engine MotorcycleEngine) {
        super(make, model, speed);
        this.hasSideCar = hasSideCar;
        this.MotorcycleEngine = new MotorcycleEngine();

    }
}
