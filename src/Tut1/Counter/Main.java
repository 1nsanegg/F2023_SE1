package Tut1.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("The value is " + counter.get());
        counter.incr();
        System.out.println("The value is " +counter.get());
        counter.incr();
        System.out.println("The value is " +counter.get());
    }
}
