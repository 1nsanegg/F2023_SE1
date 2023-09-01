package Tut2.Counter;

public class Counter2 extends Counter {
    /**
     * @modifies this
     * @effects Makes this contain twice its current value.
     */
    public Counter2() {
        this.value = 0;
    }

    public void incr() {
        value *= 2;
    }
}
