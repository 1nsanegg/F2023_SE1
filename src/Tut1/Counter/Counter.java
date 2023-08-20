package Tut1.Counter;

public class Counter {
    private int value;
    /**
     * @effects Makes this contain 0
     */
    public Counter() {
        value = 0;
    }
    /**
     *
     * @effects Returns the value of this
     */
    public int get() {
        return value;
    }
    /**
     * @modifies this
     * @effects Increments the value of this
     */
    public void incr() {
        value++;
    }

}
