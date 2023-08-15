package chap_06;

public class _05_Overlading {
    public static int getPower(int x) {
        int total = x * x ;
        return total;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int x, int exponent) {
        int result = 1;
        for (int i=0; i < exponent; i++) {
            result *= x;
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(getPower("15"));
        System.out.println(getPower(3));
        System.out.println(getPower(3 ,5));
    }
}
