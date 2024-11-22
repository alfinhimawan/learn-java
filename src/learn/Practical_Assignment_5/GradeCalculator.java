package learn.Practical_Assignment_5;

import javax.swing.JOptionPane;

public class GradeCalculator {
    public static void main(String[] args) {
        // Input nilai dari pengguna melalui JOptionPane
        String inputNilai = JOptionPane.showInputDialog("Masukkan nilai:");

        // Validasi input dan konversi
        double nilai;
        try {
            nilai = Double.parseDouble(inputNilai); // Konversi string ke angka
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid. Mohon masukkan angka yang benar.");
            return; // Menghentikan eksekusi lebih lanjut
        }
        
        String grade = "";

        // Menentukan grade berdasarkan nilai yang dimasukkan
        if (nilai > 85) {
            grade = "A";
        } else if (nilai > 80 && nilai <= 85) {
            grade = "A-";
        } else if (nilai > 76 && nilai <= 80) {
            grade = "B+";
        } else if (nilai > 74 && nilai <= 76) {
            grade = "B";
        } else if (nilai > 70 && nilai <= 74) {
            grade = "B-";
        } else if (nilai > 65 && nilai <= 70) {
            grade = "C+";
        } else if (nilai > 60 && nilai <= 65) {
            grade = "C";
        } else if (nilai > 55 && nilai <= 60) {
            grade = "C-";
        } else if (nilai > 50 && nilai <= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Output grade melalui JOptionPane
        JOptionPane.showMessageDialog(null, "Grade : " + grade);
    }
}
