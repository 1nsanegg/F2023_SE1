package tut3;

public class DivideArray {
    public static void main(String[] args) {
        int[] array = new int[]{12, 3, 4, 5};
        int[] array2 = new int[]{2, 1, 2, 5};
        divide(array, array2);
    }

    public static void divide(int[] a, int[] b) {
        try {
            if (a.length == b.length) {
                for (int i = 0; i < a.length; i++) {
                    int result = a[i] / b[i];
                    System.out.println(result); // Move this line here
                }
            } else {
                System.out.println("Error: Arrays have different lengths");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}
