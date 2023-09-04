package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡술화 (Encapsulation)
        // 정보 은닉 (Information hiding)

        // AccessModifier
        // Private : 해당 클래스 내에서만 접근 가능
        // Public : 모든 클래스에서 접근 가능
        // Default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // Protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "발랑이";
        b1.resolution = "UHD";
        b1.setPrice(20000);
        b1.color = "Black";

        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

    }
}