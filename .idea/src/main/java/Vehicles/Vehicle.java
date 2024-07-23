package Vehicles;

public abstract class Vehicle {
    private String make;
    private String model;
    private int speed;

    public Vehicle(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

}