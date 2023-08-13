package chap_04;

public class _02_else {
    public static void main(String[] args) {
        int hour = 10;

        if (hour < 14) {
            System.out.println("아이스 아메리카노 + 1");
        } else {
            System.out.println("아이스 아메리카노 (디 카페인) + 1");
        }

        System.out.println("커피 주문 완료");
        System.out.println("===============================");

        hour = 15;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디 카페인) + 1");
        } else {
            System.out.println("아이스 아메리카노");
        }
        System.out.println("커피 주문 완료");
        System.out.println("===============================");
    }
}

