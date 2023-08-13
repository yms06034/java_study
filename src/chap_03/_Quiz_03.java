package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String s = "990123-1019316";

        System.out.println(s.substring(0, 8));
        System.out.println(s.substring(0, s.indexOf("-") + 2));
    }
}
