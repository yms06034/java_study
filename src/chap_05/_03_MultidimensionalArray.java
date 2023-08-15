package chap_05;

public class _03_MultidimensionalArray {
    public static void main(String[] args) {
        String[][] seats = {
            {"A1", "A2", "A3", "A4", "A5"},
            {"B1", "B2", "B3", "B4", "B5"},
            {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[1].length; j++) {
                System.out.println(seats[i][j]);
            }
        }

        String[][][] marray = {
            {{"A1"}, {"A2", "A3"}, {"A4", "A5"}},
            {{"B1"}, {"B2", "B3"}, {"B4", "B5"}},
            {{"C1"}, {"C2", "C3"}, {"C4", "C5"}}
        };
    }
}
