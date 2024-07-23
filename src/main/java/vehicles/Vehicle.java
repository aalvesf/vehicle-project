package vehicles;

public abstract class Vehicle {
    public String make;
    public String model;
    public int speed;
    public Engine engine;
    boolean running;

    public Vehicle(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }
    public boolean isRunning() {
        return running;
    }

    public void drive() {
        if (engine.isRunning()) {
            accelerate();
        } else {
            System.out.println(make + " " + model + " is not running.");
        }
    }

    protected abstract void accelerate();

}