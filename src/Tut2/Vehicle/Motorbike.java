package Tut2.Vehicle;

public class Motorbike extends Vehicle {
    protected int speed;

    public Motorbike(String name, double width, double height, double length, double weight, int seatingCapacity, int speed) {
        super(name, width, height, length, weight, seatingCapacity);
        this.speed = speed;
    }

}
