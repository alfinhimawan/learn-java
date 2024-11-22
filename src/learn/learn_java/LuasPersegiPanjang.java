package learn.learn_java;

import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input panjang dan lebar
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        // Menghitung luas
        double luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas persegi panjang adalah: " + luas);

        // Menutup scanner
        scanner.close();
    }
}