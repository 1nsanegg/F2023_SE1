package Tut2.Counter;

public class Counter {
    protected int value;

    /**
     * @effects Makes this contain 0
     */
    public Counter() {
        this.value = 0;
    }

    /**
     * @effects return the value of this
     */
    public int get() {
        return value;
    }

    /**
     * @modifies this
     * @effects increment the value of this
     */
    public void incr() {
        value++;
    }
}
