package learn.Practical_Assignment_6;

import java.util.Scanner;

public class PolaSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===Pola===");
        System.out.print("Masukkan nilai N = ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}

