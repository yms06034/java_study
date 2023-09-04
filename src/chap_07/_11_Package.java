package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // Package (Random Class)
        Random random = new Random();
        System.out.println("Random int : " + random.nextInt());
        System.out.println("Random int (범위) : " + random.nextInt(10));
        System.out.println("Random double : " + random.nextDouble());
        System.out.println("Random double (범위) : " + random.nextDouble());
        double min = 5.0;
        double max = 10.0;
        System.out.println("double (범위) : " + (min + (max - min)) * random.nextDouble());

        System.out.println("Random Boolean : " + random.nextBoolean());

        // 로또 번호를 랜덤으로 출력하려면...? 1~45
        for (int i=0; i <= 6; i++) {
            System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
        }
    }
}
