package LAB_9;

public class Truck extends Car {

    public Truck(int speed) {
        super(speed);
    }

    @Override
    public double fuelConsumption() {
        return 15.0;
    }
}