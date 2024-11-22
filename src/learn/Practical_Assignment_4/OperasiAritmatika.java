package learn.Practical_Assignment_4;

import java.util.Scanner;

public class OperasiAritmatika {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a : ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b : ");
        int b = input.nextInt();

        int c = a + b;
        int d = a - b;
        int e = a / b;
        double f = (double) a / b;
        int g = a * b;
        int h = a % b;

        System.out.println("Penggunaan Operator Aritmatika");
        System.out.println("Nilai awal a adalah : " + a);
        System.out.println("Nilai awal b adalah : " + b);
        System.out.println("Hasil dari a + b = " + c);
        System.out.println("Hasil dari a - b = " + d);
        System.out.println("Hasil dari a / b (integer) = " + e);
        System.out.println("Hasil dari a / b (double) = " + f);
        System.out.println("Hasil dari a * b = " + g);
        System.out.println("Hasil dari a % b = " + h);

        input.close();
    }
}
