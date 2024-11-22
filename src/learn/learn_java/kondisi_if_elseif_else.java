package learn.learn_java;

public class kondisi_if_elseif_else {
    public static void main(String[] args) {
        int nilai = 85;

        // Kondisi if...else if...else
        if (nilai >= 90) {
            System.out.println("Nilai Anda sangat baik");
        } else if (nilai >= 80) {
            System.out.println("Nilai Anda baik");
        } else if (nilai >= 70) {
            System.out.println("Nilai Anda cukup");
        } else {
            System.out.println("Nilai Anda kurang");
        }
    }
}
