package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "발랑이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "까망이";
        System.out.println(b2.modelName+ "\n");


        System.out.println(" - Before development - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + BlackBox.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + BlackBox.canAutoReport);

        System.out.println("\n - After development - ");
        BlackBox.canAutoReport = true;

        System.out.println(b1.modelName + " 자동 신고 기능 : " + BlackBox.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + BlackBox.canAutoReport);
    }
}
