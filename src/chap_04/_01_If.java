package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 12;

        if (hour < 14) {
            System.out.println("아이스 아메리카노");
            System.out.println("샷 추가");
        }
        
        System.out.println("커피 주문 완료");
        System.out.println("===============================");

        hour = 10;
        boolean morningCoffee = false;
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료");

        System.out.println("===============================");

        hour = 15;
        morningCoffee = true;
        if (hour >= 20 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디 카페인)");
        }
        System.out.println("커피 주문 완료");
    }
}
