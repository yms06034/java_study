package chap_02;

public class _05_Operator5 {
    public static void main (String[] args) {
        // Ternary Operator
        // Result = (condition) ? (result value if true): (result value if false)

        int x = 5;
        int y = 3;

        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        boolean b_f = (x != y) ? true : false;
        System.out.println(b);
        System.out.println(b_f);

        String s = (x != y) ? "다름" : "같음";
        System.out.println(s);
    }
}
