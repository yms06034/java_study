package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        int max = 20;
        int sold = 0;
        int noShow = 17;
        int customer = 50;

        for (int i = 1; i <=  customer; i++) {
            System.out.println(i + "번 손님, 주문하신 음식이 나왔습니다.");

            if (i == noShow) {
                System.out.println();
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                System.out.println();
                continue;
            }
            sold++;
            if (max == sold) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
        }

        System.out.println("===============================");

        sold = 0;
        int idx = 0;
        while (true) {
            idx++;
            System.out.println(idx + "번 손님, 주문하신 음식이 나왔습니다.");

            if (idx == noShow) {
                System.out.println(idx + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;
            if (max == sold) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
