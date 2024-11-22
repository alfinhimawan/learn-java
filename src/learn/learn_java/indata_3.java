package learn.learn_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class indata_3 {
    public static void main(String[] args) {
        BufferedReader dataTeks = new BufferedReader(new InputStreamReader(
                System.in));
        String nama = "";
        System.out.print("Masukkan Nama Anda : ");
        try {
            nama = dataTeks.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hallo " + nama + "!");
        BufferedReader dataBilBul = new BufferedReader(new InputStreamReader(System.in));
        String bb = "";
        int bilbul;
        System.out.print("Masukkan Suatu Bilangan Bulat : ");
        try {
            bb = dataBilBul.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        bilbul = Integer.parseInt(bb);
        System.out.println("Bilangan Bulat yang anda masukkan : " +
                bilbul);
        BufferedReader dataBilReal = new BufferedReader(new InputStreamReader(System.in));
        String br = "";
        double bilR;
        System.out.print("Masukkan Suatu Bilangan Real : ");
        try {
            br = dataBilReal.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        bilR = Double.parseDouble(br);
        System.out.println("Bilangan Real yang anda masukkan : " + bilR);

    }
}
