package chap_06;

public class _06_WhenToUse {
    public static int getPower(int x) {
        return getPower(x, 2);
    }

    public static int getPower(int x, int exponent) {
        int result = 1;
        for (int i=0; i < exponent; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        // Why you need a method
        System.out.println(getPower(3, 4));
    }
}
