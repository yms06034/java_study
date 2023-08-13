package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height_1 = 115;
        int height_2 = 121;
        int criteria = 120;


        String result = (criteria <= height_1) ? "키가 " + height_1 + "cm 이므로 탑승이 가능합니다." : "키가 " + height_1 + "cm 이므로 탑승 불가능 합니다.";
        System.out.println(result);
    }
}
