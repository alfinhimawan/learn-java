package learn.learn_java;

import java.util.Scanner;

public class HitungLuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat Scanner untuk input

        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble(); // Membaca input jari-jari dari pengguna

        double luasLingkaran = Math.PI * radius * radius; // Rumus luas lingkaran

        System.out.println("Luas lingkaran dengan jari-jari " + radius + " adalah: " + luasLingkaran);
    }
}
