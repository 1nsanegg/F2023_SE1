package Tut2.Vehicle;

public class IronSuit extends Vehicle{
    protected int size;

    public IronSuit(String name, double width, double height, double length, double weight, int seatingCapacity, int size) {
        super(name, width, height, length, weight, seatingCapacity);
        this.size = size;
    }

    public IronSuit(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, int size) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.size = size;
    }

    public IronSuit() {
    }

    public void fly(String a, String b, int distance)  {

        int millis = 300;

        System.out.print(a + " ");
        for (int i = 0; i < distance; i++) {
            System.out.print(" .");
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(" " + b);
    }


}
