package chap_06;

public class _04_ParameterAndReturn {
    public static String phoneNumber(String tel) {
        return tel + "-1234-5678";
    }

    public static int getPower(int x) {
        int total = x * x ;
        return total;
    }

    public static int getPowerByExp(int x, int exponent) {
        int result = 1;
        for (int i=0; i < exponent; i++) {
            result *= x;
        }
        return result;
    }


    public static void main(String[] args) {
//        System.out.println(phoneNumber("010"));

        int total = getPower(2);
        System.out.println("getPower : " + total);

        int result = getPowerByExp(4, 10);
        System.out.println("getPowerByExp : " + result);

    }
}
