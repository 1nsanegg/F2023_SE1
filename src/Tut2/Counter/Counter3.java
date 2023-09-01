package Tut2.Counter;
public class Counter3 extends Counter {
    /**
     * @effects Makes this contain n
     */
    public Counter3(int n) {
        this.value = n;
    }

    /**
     * @modifies this
     * @modifies if n > 0 adds n to this
     */
    public void incr(int n) {
        if (n > 0) {
            value += n;
        }
    }

}
