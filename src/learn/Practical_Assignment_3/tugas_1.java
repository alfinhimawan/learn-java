package learn.Practical_Assignment_3;

import java.util.Scanner;

public class tugas_1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan Nama : ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan NIM : ");
            long nim = scanner.nextLong(); 
            
            scanner.nextLine();
            
            System.out.print("Masukkan Alamat : ");
            String alamat = scanner.nextLine();
            
            System.out.println("\nData yang dimasukkan :");
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + nim);
            System.out.println("Alamat : " + alamat);
            
            scanner.close();
    }
}
