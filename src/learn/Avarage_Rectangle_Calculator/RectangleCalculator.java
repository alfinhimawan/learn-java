package learn.Avarage_Rectangle_Calculator;

import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang (p): ");
        double p = input.nextDouble();

        System.out.print("Masukkan lebar (l): ");
        double l = input.nextDouble();

        double luas = p * l;
        double keliling = 2 * (p + l);

        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);

        input.close();
    }
}
