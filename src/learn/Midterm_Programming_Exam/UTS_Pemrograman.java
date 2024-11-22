package learn.Midterm_Programming_Exam;

import java.util.Scanner;

public class UTS_Pemrograman {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;

        do {
            System.out.println("\nMenu Program");
            System.out.println("a. Menghitung Luas dan Keliling Lingkaran");
            System.out.println("b. Menampilkan Deret dan Jumlahnya");
            System.out.println("c. Menampilkan Pola Angka");
            System.out.print("Masukkan pilihan menu (a/b/c): ");
            pilihan = input.next().charAt(0);

            switch (pilihan) {
                case 'a':
                    hitungLuasKelilingLingkaran(input);
                    break;
                case 'b':
                    tampilkanDeretDanJumlah(input);
                    break;
                case 'c':
                    tampilkanPolaAngka(input);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.print("\nApakah Anda ingin keluar? (y/n): ");
            pilihan = input.next().charAt(0);

        } while (pilihan != 'y');

        System.out.println("Terima kasih Sampai Jumpa Kembali.");
        input.close();
    }

    public static void hitungLuasKelilingLingkaran(Scanner input) {
        System.out.println("\nProgram Menghitung Luas dan Keliling Lingkaran");
        System.out.print("Masukkan diameter lingkaran (d): ");
        double diameter = input.nextDouble();
        double radius = diameter / 2;

        double luas = PHI * radius * radius;
        double keliling = 2 * PHI * radius;

        System.out.printf("Luas = PHI x r^2\n");
        System.out.printf("     = %.2f x %.2f^2\n", PHI, radius);
        System.out.printf("     = %.2f\n", luas);
        System.out.printf("Keliling = 2 x PHI x r\n");
        System.out.printf("         = 2 x %.2f x %.2f\n", PHI, radius);
        System.out.printf("         = %.2f\n", keliling);
    }

    public static void tampilkanDeretDanJumlah(Scanner input) {
        System.out.println("\nProgram Menampilkan Deret dan Jumlahnya");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah N (batas): ");
        int n = input.nextInt();
        double jumlah = 0;
        StringBuilder deret = new StringBuilder();

        for (int i = 0; i < n; i++) {
            double nilai = Math.round((3.14 + (i * 6.28)) * 100.0) / 100.0;
            deret.append(nilai);
            jumlah += nilai;
            if (i < n - 1) {
                deret.append(" + ");
            }
        }
        System.out.printf("Deret: %s = %.2f\n", deret.toString(), jumlah);
    }

    public static void tampilkanPolaAngka(Scanner input) {
        System.out.println("\nProgram Menampilkan Pola Angka");
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
