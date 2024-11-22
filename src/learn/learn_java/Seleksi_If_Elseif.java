package learn.learn_java;

public class Seleksi_If_Elseif {
    public static void main(String[] args) {
        int bulan = 3; // Nilai bulan
        System.out.println("Bulan ke-: " + bulan);

        // Logika seleksi if-elseif-else
        if (bulan <= 3) {
            System.out.println("Kuartal 1 dipilih Seleksi If1");
        } else if (bulan <= 6) {
            System.out.println("Kuartal 2 dipilih Seleksi else1If2");
        } else if (bulan <= 9) {
            System.out.println("Kuartal 3 dipilih Seleksi else2If3");
        } else {
            System.out.println("Kuartal 4 dipilih Seleksi else3");
        }
    }
}
