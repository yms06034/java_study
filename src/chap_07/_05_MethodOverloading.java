package chap_07;
import java.time.LocalDate;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "발랑이";

        LocalDate now = LocalDate.now();

        b1.record(true, false, 10);
        System.out.println("\n");
        b1.record(true, true, 10);
        b1.record(10);

        String s = "Black";
        System.out.println(s.indexOf(s));
    }
}
