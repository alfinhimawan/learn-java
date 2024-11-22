package learn.learn_array;

public class Array_4 {
    public static void main(String[] args) {
        int[][] dataku = { { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 },
                { 1, 2, 3 },
                { 4, 5, 6 } };
        System.out.println("Isi dataku posisi [1][2] adalah = " + dataku[1][2]);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Isi dataku baris [" + i + "] kolom[" + j + "] = " + dataku[i][j]);
            }
        }

    }
}
