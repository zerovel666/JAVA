package LAB_9;

public class Car {
    protected int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void showSpeed() {
        System.out.println("Скорость: " + speed + " км/ч");
    }

    public double fuelConsumption() {
        return 0;
    }
}
