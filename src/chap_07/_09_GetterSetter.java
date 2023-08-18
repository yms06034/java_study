package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "발랑이";
        b1.resolution = "UHD";
        b1.price = 20000;
        b1.color = "Black";

        b1.price = -5000;
        System.out.println("가격 : " + b1.price + "원");


    }
}
