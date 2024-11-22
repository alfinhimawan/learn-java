package learn.learn_java;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan huruf (A, B, C, D): ");
        char huruf = scanner.next().charAt(0);
        
        switch (huruf) {
            case 'A':
                System.out.println("Nilai: 90-100");
                break;
            case 'B':
                System.out.println("Nilai: 80-89");
                break;
            case 'C':
                System.out.println("Nilai: 70-79");
                break;
            case 'D':
                System.out.println("Nilai: 60-69");
                break;
            default:
                System.out.println("Huruf tidak valid");
        }
        
        scanner.close();
    }
}

