package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C";

        System.out.println(s.replace("Java", "JavaScript"));
        System.out.println(s.substring(7));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.lastIndexOf(" and")));

        String s1 = "           I like Python     ";
        System.out.println(s1);
        System.out.println(s1.trim());
        System.out.println(s1.replace(" ", ""));

        String s2 = "Java";
        String s3 = "Python";
        System.out.println(s2 + "," + s3);
        System.out.println(s2.concat(",").concat(s3));
    }
}
