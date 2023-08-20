package Tut1.Vehicle;

public class Bus extends Vehicle{
    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity) {
        super(name, width, height, length, weight, seatingCapacity);
    }

    @Override
    public boolean validateWeight(double weight) {
        return 5000.0 < weight & weight < 20000.0;
    }

    @Override
    public boolean validateLength(double length) {
        return length > 4.0 & length < 10.0;
    }
}
