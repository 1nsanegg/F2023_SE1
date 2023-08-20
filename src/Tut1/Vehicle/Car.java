package Tut1.Vehicle;

public class Car extends Vehicle{
    public Car(String name, double width, double height, double length, double weight, int seatingCapacity) {
        super(name, width, height, length, weight, seatingCapacity);
    }


    @Override
    public boolean validateWeight(double weight) {
        return weight < 2000 & weight > 1000.0;
    }

    @Override
    public boolean validateLength(double length) {
        return length > 1.5 & length < 3.5;
    }
}
