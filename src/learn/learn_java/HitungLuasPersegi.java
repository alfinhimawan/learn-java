package learn.learn_java;

import java.util.Scanner;

public class HitungLuasPersegi {
    public static void main(String[] args) {
           // Membuat objek Scanner untuk membaca input dari pengguna
           Scanner input = new Scanner(System.in);

           // Meminta pengguna untuk memasukkan panjang sisi persegi
           System.out.print("Masukkan panjang sisi persegi: ");
           double sisi = input.nextDouble();
   
           // Menghitung luas persegi
           double luas = sisi * sisi;
   
           // Menampilkan hasil perhitungan
           System.out.println("Luas persegi adalah: " + luas);
   
           // Menutup scanner
           input.close();
    }
}
