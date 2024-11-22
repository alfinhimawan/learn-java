package learn.Practical_Class_Object;

import java.util.Scanner;

class Truk {
    private double muatan = 0.0;
    private double muatanmaks;

    public Truk(double beratmaks) {
        this.muatanmaks = beratmaks;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanMaks() {
        return muatanmaks;
    }

    public boolean tambahMuatan(double berat) {
        if (muatan + berat <= muatanmaks) {
            muatan += berat;
            return true;
        } else {
            return false;
        }
    }

    public void resetMuatan() {
        muatan = 0.0;
    }
}

public class TestTruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        System.out.println("Selamat datang di Program Truk Kapasitas!");

        while (ulang) {
            System.out.print("Masukkan muatan maksimum : ");
            double beratmaks = scanner.nextDouble();

            Truk truk = new Truk(beratmaks);
            truk.resetMuatan();

            System.out.println("\nBatas Muatan Maksimal : " + truk.getMuatanMaks());

            while (truk.getMuatan() < truk.getMuatanMaks()) {
                System.out.print("Tambah muatan : ");
                double berat = scanner.nextDouble();

                if (truk.tambahMuatan(berat)) {
                    System.out.println("Muatan sekarang = " + truk.getMuatan());

                    if (truk.getMuatan() == truk.getMuatanMaks()) {
                        System.out.println("Muatan sudah mencapai kapasitas maksimum!");
                        break;
                    }
                } else {
                    double totalMuatanBaru = truk.getMuatan() + berat;
                    double kelebihan = totalMuatanBaru - truk.getMuatanMaks();
                    System.out.println("Muatan melebihi kapasitas maksimum sebesar " + kelebihan + "!"
                            + " Batas maksimal kapasitas truk adalah " + truk.getMuatanMaks() + ".");
                    System.out.println("Muatan sekarang = " + truk.getMuatan());
                    break;
                }
            }

            System.out.print("Apakah Anda ingin memulai ulang dengan kapasitas baru? (y/n) : ");
            char pilihan = scanner.next().charAt(0);
            ulang = (pilihan == 'y' || pilihan == 'Y');
        }

        System.out.println("Terima kasih telah menggunakan Program Truk Kapasitas!");
        scanner.close();
    }
}
