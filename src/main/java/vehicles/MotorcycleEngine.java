package vehicles;

public class MotorcycleEngine extends Engine {
    boolean running;
    int horsepower;
    String fuelType;


    public MotorcycleEngine(boolean running, int horsepower, String fuelType) {
        super(running, horsepower, fuelType);
        this.running = running;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
}
