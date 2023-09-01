package tut3.Ex2;

public class Ex2 {
    public static int fact(int n) throws NonPositiveException {
        int fact = 1;
        if (n < 0) {
            throw new NonPositiveException("NonPositive Number!!!");
        } else {
            for (int i = 1; i <n ; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public static int search(int[] a, int x) throws NullPointerException, NotFoundException {
        if (a == null) {
            throw new NullPointerException("This list is empty!!!");
        } else {
            if (notHasX(a, x)) {
                throw new NotFoundException("This x is not in a!!!");
            } else {
                System.out.println("i = " + hasX(a, x));
            }
        }

        return x;
    }

    public static boolean notHasX(int[] a, int x) {
        boolean hasX = true;
        for (int i = 0; i <a.length - 1 ; i++) {
            if (a[i] == x) {
                hasX = false;
                break;
            }
        }
        return hasX ;
    }

    public static int hasX(int [] a, int x) {
        int i;
        for (i = 0; i < a.length - 1; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return i;
    }
}
