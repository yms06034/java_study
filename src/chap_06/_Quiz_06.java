package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int idx) {
        String hiddenData = data.substring(0, idx);
        for (int i = 0; i < data.length() - idx; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        System.out.println(getHiddenData("990123-1019316", 8));
    }
}
