package chap_02;

public class _01_Operator1 {
    public static void main (String[] args) {

        int val;

        val = 10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);

        int waiting = 0;
        System.out.println("대기 인원 : " +  waiting++);
        System.out.println("대기 인원 : " +  waiting++);
        System.out.println("대기 인원 : " +  waiting++);
        System.out.println("총 대기 인원 : " +  waiting);
    }
}
