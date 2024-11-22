package learn.learn_array;

public class Array_5 {
    public static void main(String[] args) {
        int[] dataku = new int[5];
        for (int i = 0; i < dataku.length; i++) {
            dataku[i] = (int) (Math.random() * 100);
        }
        System.out.println("DATA MULA-MULA : ");
        for (int i = 0; i < dataku.length; i++) {
            System.out.println("\tIsi dataku[" + i + "] = "
                    + dataku[i]);
        }
        // Proses SORTIR
        for (int i = dataku.length - 1; i > 0; i--) {
            for (int kiri = 0; kiri < i; kiri++) {
                int kanan = kiri + 1;
                if (dataku[kiri] > dataku[kanan]) {
                    int bantu = dataku[kiri];
                    dataku[kiri] = dataku[kanan];
                    dataku[kanan] = bantu;
                }
            }
        }
        System.out.println("DATA SETELAH DISORTIR: ");
        for (int i = 0; i < dataku.length; i++) {
            System.out.println("\tIsi dataku[" + i + "] = "
                    + dataku[i]);
        }
    }
}
