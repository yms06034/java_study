package chap_06;

public class _02_Parameter {
    public static void power(int x) {
        int total = x * x ;
        System.out.println(x + " 의 2승은 " + total);
    }

    public static void powerByExp(int x, int exponent) {
        int result = 1;
        for (int i=0; i < exponent; i++) {
            result *= x;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        power(3);
        powerByExp(3, 7);
    }
}
