package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // ANSI : 대문자(A) 65부터 시작, 소문자(a) 97부터 시작, 숫자(0) 48부터 시작
        char A = 'A';
        char a = 'a';
        System.out.println("A : " + (int)A);
        System.out.println("a : " + (int)a);

        char ㄱ = 'ㄱ';
        System.out.println(ㄱ);
        System.out.println((int)ㄱ);
        ㄱ++;
        System.out.println(ㄱ);
        System.out.println((int)ㄱ);


        System.out.println("\n=========================\n");

        String[][] seats3 = new String[10][15];
        char ch = 'A';

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
