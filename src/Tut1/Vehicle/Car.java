package Tut1.Vehicle;

public class Car extends Vehicle{
    private final static int max_Car_Registration_Number_Length = 8;

    public Car(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
    }

    @Override
    public boolean validateRegistrationNumber(String registrationNumber) {
        return registrationNumber.length() < max_Car_Registration_Number_Length;
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
