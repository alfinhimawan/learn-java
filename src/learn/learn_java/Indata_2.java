package learn.learn_java;

import javax.swing.JOptionPane;

public class Indata_2 {
    public static void main(String[] args) {
        // Memasukkan data
        String kalimat = JOptionPane.showInputDialog(null, "Ketikkan sebuah kata",
                "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);
        String bilbul = JOptionPane.showInputDialog(null, "Masukkan bilangan bulat",
                "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);
        int bilb = Integer.parseInt(bilbul);
        String bilreal = JOptionPane.showInputDialog(null, "Ketikkan bilangan pecahan", "Memasukkan Data",
                JOptionPane.QUESTION_MESSAGE);
        double bilR = Double.parseDouble(bilreal);
        // Menampilkan pesan dan data
        JOptionPane.showMessageDialog(null, kalimat, "Tampilkan Teks",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, bilb, "Tampilkan Bilangan Bulat",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, bilR, "Tampilkan Bilangan Pecahan",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
