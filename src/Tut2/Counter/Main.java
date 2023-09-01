package Tut2.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter2();
        Counter counter3 = new Counter3(3);

        System.out.println("This is counter");
        System.out.println("The value is " + counter.get());
        counter.incr();
        System.out.println("The value is " +counter.get());
        counter.incr();
        System.out.println("The value is " +counter.get());

        System.out.println("This is counter2");
        System.out.println("The value is " + counter2.get());
        counter2.incr();
        System.out.println("The value is " +counter2.get());
        counter2.incr();
        System.out.println("The value is " +counter2.get());

        System.out.println("This is counter3");
        System.out.println("The value is " + counter3.get());
        counter3.incr(3);
        System.out.println("The value is " +counter3.get());
        counter3.incr(3);
        System.out.println("The value is " +counter3.get());

    }
}
