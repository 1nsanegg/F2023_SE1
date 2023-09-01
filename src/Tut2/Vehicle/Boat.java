package Tut2.Vehicle;

public class Boat extends Vehicle {
    protected String engine;

    public Boat(String name, double width, double height, double length, double weight, int seatingCapacity, String engine) {
        super(name, width, height, length, weight, seatingCapacity);
        this.engine = engine;
    }
}
