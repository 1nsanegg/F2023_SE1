package Tut1.Vehicle;

public class Vehicle {
    protected String name;
    protected double width;
    protected double height;
    protected double length;
    protected double weight;
    protected int seatingCapacity;

    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity) {
        if (validateName(name)
                & validateWidth(width)
                & validateHeight(height)
                & validateLength(length)
                & validateWeight(weight)
                & validateSeatCapacity(seatingCapacity)) {
            this.name = name;
            this.width = width;
            this.height = height;
            this.length = length;
            this.weight = weight;
            this.seatingCapacity = seatingCapacity;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean validateWidth(double width) {
        return width > 0;
    }

    public boolean validateHeight(double height) {
        return height > 0;
    }

    public boolean validateWeight(double weight) {
        return weight > 0;
    }

    public boolean validateLength(double length) {
        return length > 0;
    }

    public boolean validateSeatCapacity(int seatingCapacity) {
        return seatingCapacity > 0;
    }

    public boolean validateName(String name) {
        return name.length() < 100;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", weight=" + weight +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
