package learn.learn_java;

public class Seleksi_Switch {
    public static void main(String[] args) {
        int bulan, year;
        bulan = 1;
        year = 2005;
        switch (bulan) {
            case 1:
                switch (year) {
                    case 2004:
                        System.out.println("Bulan 1 tahun 2004");
                        break;
                    case 2005:
                        System.out.println("Bulan 1 tahun 2005");
                        break;
                }
                break;
            case 2:
                switch (year) {
                    case 2004:
                        System.out.println("Bulan 2 tahun 2004");
                        break;
                    case 2005:
                        System.out.println("Bulan 2 tahun 2005");
                        break;
                }
                break;
            case 3:
                switch (year) {
                    case 2004:
                        System.out.println("Bulan 3 tahun 2004");
                        break;
                    case 2005:
                        System.out.println("Bulan 3 tahun 2005");
                        break;
                }
                break;
            default:
                System.out.println("Bulan tidak ada pada pilihan");
                break;
        }
        System.out.println("Sudah keluar dari switch");
    }
}
