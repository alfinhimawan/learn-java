package learn.learn_java;

import java.util.Scanner;

public class Indata {
    public static void main(String[] args) {
        // Memasukkan data
        System.out.print("Masukkan data teks : ");
        Scanner kal = new Scanner(System.in);
        String kata = kal.next();
        System.out.print("Masukkan data bilangan bulat : ");
        Scanner bilbulat = new Scanner(System.in);
        int bilbul = bilbulat.nextInt();
        System.out.print("Masukkan data bilangan real/pecahan : ");
        Scanner bilreal = new Scanner(System.in);
        double bilR = bilreal.nextDouble();
        // Menampilkan pesan dan data
        System.out.println("Teks yang anda masukkan : " + kata);
        System.out.println("Bilangan bulat yang anda masukkan : " +
                bilbul);
        System.out.println("Bilangan real yang anda masukkan : " +
                bilR);

    }
}
