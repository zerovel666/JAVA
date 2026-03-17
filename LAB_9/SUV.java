package LAB_9;

public class SUV extends Car {

    public SUV(int speed) {
        super(speed);
    }

    @Override
    public double fuelConsumption() {
        return 10.0;
    }
}