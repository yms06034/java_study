package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();

        b1.modelName = "발랑이";
        b1.resolution = "FHD";
        b1.price = 2000000;
        b1.color = "Black";

        System.out.println("============================");

        BlackBox b2 = new BlackBox("발랑이", "UHD", 2000000, "Black");
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
        System.out.println(b2.serialNumber);

        System.out.println("============================");

        BlackBox b3 = new BlackBox("발랑이", "UHD", 2000000, "Black");
        System.out.println(b3.modelName);
        System.out.println(b3.resolution);
        System.out.println(b3.price);
        System.out.println(b3.color);
        System.out.println(b3.serialNumber);
    }
}
