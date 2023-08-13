package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);

        if (김치찌개 && 계란말이 && 제육볶음) {
            System.out.println("너무 좋은 식당");
        }
        else {
            System.out.println("다른 식당 가자");
        }

        // 부정 연산자 !true == false  ||  !false == true
        if (!김치찌개) {
            System.out.println("김치찌개가 없음");
        }
        System.out.println("김채찌개가 있음");
    }
}
