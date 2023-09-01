package Tut2.Vehicle;

public class Bus extends Vehicle {
    protected int[] router;
    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity, int[] router) {
        super(name, width, height, length, weight, seatingCapacity);
        this.router = router;
        this.symbol = "\uD83D\uDE8C";
    }

    @Override
    public boolean validateWeight(double weight) {
        if (weight > 20000 || weight < 5000) {
            return false;
        } else
            return true;
    }
    @Override
    public boolean validateLength( double length) {
        return !(length > 4) && !(length < 10);
    }
    @Override
    public boolean validateName(String name) {
        return !name.isEmpty();
    }
    @Override
    public boolean validateRegistrationNumber(String registrationNumber) {
        String  vnRegistrationNumberRegex= "//s{2}[A-Z]-//d{5}";
        return registrationNumber.matches(vnRegistrationNumberRegex);
    }
}
