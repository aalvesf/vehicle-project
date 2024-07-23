package vehicles;

public class CarEngine extends Engine {
    boolean running;
    int horsepower;
    String fuelType;


    public CarEngine(boolean running, int horsepower, String fuelType) {
        super(running, horsepower, fuelType);
        this.running = running;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public CarEngine() {
        super();
    }

    }

