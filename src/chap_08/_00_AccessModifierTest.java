package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();

        b1.modelName = "Balang"; // public
        b1.setPrice(2000); //
        b1.setColor("Black");

        System.out.println(b1.getColor() + b1.getPrice());
    }
}
