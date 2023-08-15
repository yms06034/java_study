package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        int max = 20;
        int guest = 50;

        for (int i = 0; i <= guest; i++) {
            System.out.println(i + "번 손님, 주문하신 음식 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료 합니다.");
        System.out.println("=============================");

        int idx = 1;
        while (idx <= guest) {
            System.out.println(idx + "번 손님, 주문하신 음식 나왔습니다.");
            if (idx == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            idx++;
        }
        System.out.println("영업을 종료 합니다.");
        System.out.println("=============================");
    }
}
