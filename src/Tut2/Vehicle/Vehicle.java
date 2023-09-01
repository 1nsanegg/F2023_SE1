package Tut2.Vehicle;


public  class Vehicle {
    protected String name;
    protected double width;
    protected double height;
    protected double length;
    protected double weight;
    protected int seatingCapacity;
    protected String registrationNumber;

    protected String symbol;

    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.seatingCapacity = seatingCapacity;
    }

    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        if(validateName(name) && validateWidth(width) && validateHeight(height) && validateLength(length) && validateWeight(weight) && validateSeatingCapacity(seatingCapacity) || validateRegistrationNumber(registrationNumber)) {
            this.name = name;
            this.width = width;
            this.height = height;
            this.length = length;
            this.weight = weight;
            this.seatingCapacity = seatingCapacity;
            this.registrationNumber = registrationNumber;
        }
    }

    public Vehicle() {
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

    public boolean validateName(String name) {
        if (name.length() == 0 ) {
            return false;
        } else
            return true;
    }
   public boolean validateWidth(double width) {
        if(width == 0) {
            return false;
        }
        return true;
   }
    public boolean validateWeight(double weight) {
        if (weight == 0) {
            return false;
        }
        return true;
    }
    public boolean validateSeatingCapacity(int seatingCapacity) {
        if (seatingCapacity == 0) {
            return false;
        }
        return true;
    }
    public boolean validateHeight(double height) {
        if (height == 0) {
            return false;
        }
        return true;
    }
    public boolean validateLength(double length) {
        if (length == 0) {
            return false;
        }
        return true;
    }
    public boolean validateRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() == 0 || registrationNumber.length() > 12) {
            return false;
        }
        return true;
    }
    public void travel(String pointA, String pointB) {
        System.out.println(String.format("%s %s is travelling from %s to %s, carrying %d people",
                this.getClass().getSimpleName(),
                symbol,
                pointA,
                pointB,
                seatingCapacity
        ));

    }
    public String toString() {

        return getClass().getSimpleName() + " [name=" + name + ", width=" + width + ", length=" + length + ", height=" + height + ", weight="
                + weight + ", seatingCapacity=" + seatingCapacity + "]";
    }
}
