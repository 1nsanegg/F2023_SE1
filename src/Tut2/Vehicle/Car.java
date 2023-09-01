package Tut2.Vehicle;

public class Car extends Vehicle{

    public Car(String name, double width, double height, double length, double weight, int seatingCapacity) {
        super(name, width, height, length, weight, seatingCapacity);
        this.symbol = "\uD83D\uDE97";
    }

    @Override
    public boolean validateLength(double length) {
        if (length > 3.5 || length < 1.5) {
            return false;
        } else
            return true;
    }
    @Override
    public boolean validateWeight(double weight) {
        if (weight > 2000 || weight < 1000) {
            return false;
        } else
            return true;
    }
    public boolean validateRegistrationNumber(String registrationNumber) {
        String  vnRegistrationNumberRegex= "//d{3}[A-Z]-//d{5}";
        return registrationNumber.matches(vnRegistrationNumberRegex);
    }
}
