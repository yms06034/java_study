package chap_04;

public class _05_for {
    public static void main(String[] args) {
        // for
        for (int i=0; i < 5; i++) {
            System.out.println("Welcome to the balang shopping mall");
        }
        for (int i=0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.println("======================");

        for (int i=10; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("======================");

        int sum = 0;
        for (int i=0; i <= 10; i++) {
            sum += i;
            System.out.println("현재 까지의 총 합은 " + sum + " 입니다.") ;
        }
        System.out.println("1부터 10까지의 총 합은 " + sum + " 입니다.");

    }
}
