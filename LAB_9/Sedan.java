package LAB_9;

public class Sedan extends Car {

    public Sedan(int speed) {
        super(speed);
    }

    @Override
    public double fuelConsumption() {
        return 6.5;
    }
}