package learn.Practical_Assignment_5;

import javax.swing.JOptionPane;

public class RangeCalculator {
    public static void main(String[] args) {
        // Input grade dari pengguna melalui JOptionPane
        String grade = JOptionPane.showInputDialog("Masukkan grade :").toUpperCase();
        String range = "";

        // Menentukan jangkauan nilai berdasarkan grade yang dimasukkan
        switch (grade) {
            case "A":
                range = "Nilai > 85";
                break;
            case "A-":
                range = "80 < Nilai <= 85";
                break;
            case "B+":
                range = "76 < Nilai <= 80";
                break;
            case "B":
                range = "74 < Nilai <= 76";
                break;
            case "B-":
                range = "70 < Nilai <= 74";
                break;
            case "C+":
                range = "65 < Nilai <= 70";
                break;
            case "C":
                range = "60 < Nilai <= 65";
                break;
            case "C-":
                range = "55 < Nilai <= 60";
                break;
            case "D":
                range = "50 < Nilai <= 55";
                break;
            case "E":
                range = "Nilai <= 50";
                break;
            default:
                range = "Grade tidak valid";
        }

        // Output jangkauan nilai melalui JOptionPane
        JOptionPane.showMessageDialog(null, "Jangkauan nilai : " + range);
    }
}
