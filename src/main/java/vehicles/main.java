package vehicles;

public class main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "X57", 120);
        car1.drive();

        Motorcycle moto1 = new Motorcycle("Bumblebee", "P99", 200, true);
        moto1.drive();
    }
}
