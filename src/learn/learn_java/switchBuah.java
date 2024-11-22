package learn.learn_java;
import java.util.Scanner;

public class switchBuah {
    public static void main(String[] args) {
        String Pilih;
        int PILIH;
        System.out.print("----MENU BUAH----\n\n1. APEL \n2. MANGGA\n3. JERUK\n\nPilihan Anda [1-3] : ");
        Scanner opsi = new Scanner(System.in);
        Pilih = opsi.next();
        PILIH = Integer.parseInt(Pilih);
        switch (PILIH) {
            case 1:
                System.out.println("\n\nANDA PILIH APEL");
                break;
            case 2:
                System.out.println("\n\nANDA PILIH MANGGA");
                break;
            case 3:
                System.out.println("\n\nANDA PILIH JERUK");
                break;
            default:
                System.out.println("\n\nANDA SALAH INPUT...");
        }

    }
}
