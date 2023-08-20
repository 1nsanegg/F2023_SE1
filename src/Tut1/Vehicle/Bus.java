package Tut1.Vehicle;

public class Bus extends Vehicle{
    private final static int max_Registration_Number_Length = 7;

    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
    }

    @Override
    public boolean validateRegistrationNumber(String registrationNumber) {
        return registrationNumber.length() < max_Registration_Number_Length;
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
