package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox a1 = new BlackBox();
//        a1.callServiceCenter();

        BlackBox a2 = new BlackBox();
//        a2.callServiceCenter();

        BlackBox.callServiceCenter();
//        a2.autoReport();

        a1.autoReport();
    }
}
