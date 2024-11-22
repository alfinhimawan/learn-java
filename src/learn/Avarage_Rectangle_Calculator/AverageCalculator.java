package learn.Avarage_Rectangle_Calculator;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A, B, C;

        System.out.print("Masukkan bilangan pertama (A) : ");
        A = scanner.nextDouble();

        System.out.print("Masukkan bilangan kedua (B) : ");
        B = scanner.nextDouble();

        System.out.print("Masukkan bilangan ketiga (C) : ");
        C = scanner.nextDouble();

        double average = (A + B + C) / 3;

        System.out.println("Rata-Rata = " + average);

        scanner.close();
    }
}
