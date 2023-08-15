package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;

        while (move + height < distance) {
            System.out.println("현재 이동 거리는 " + move);
            move += 3;
        }
        System.out.println("도착");
        System.out.println("================================");

        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("이동 시작");
            System.out.println(move);
        }

        System.out.println("================================");

        do {
            System.out.println("이동 시작");
            System.out.println(move);
            move += 3;
        } while (move + height < distance);

        System.out.println(move);
    }
}
