package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {

        BlackBox bbox = new BlackBox();
        bbox.modelName = "까망이";
        bbox.resolution = "FHD";
        bbox.price = 2000000;
        bbox.color = "BLACK";

        System.out.println(bbox.modelName + bbox.resolution + bbox.color + bbox.price + "\n");

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 3000000;
        b2.color = "WHITE";

        System.out.println(b2.modelName + b2.resolution + b2.color + b2.price);
    }
}
