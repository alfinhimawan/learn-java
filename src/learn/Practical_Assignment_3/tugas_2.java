package learn.Practical_Assignment_3;

import javax.swing.JOptionPane;

public class tugas_2 {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan data Nama melalui kotak dialog
        String nama = JOptionPane.showInputDialog("Masukkan Nama:");

        // Meminta pengguna memasukkan data NIM melalui kotak dialog
        String nimString = JOptionPane.showInputDialog("Masukkan NIM:");
        long nim;

        try {
            // Mengonversi NIM dari String ke long
            nim = Long.parseLong(nimString);
        } catch (NumberFormatException e) {
            // Menangani kesalahan jika format NIM tidak valid
            JOptionPane.showMessageDialog(null, "NIM yang dimasukkan tidak valid. Menggunakan 0 sebagai NIM default.");
            nim = 0;
        }

        // Meminta pengguna memasukkan data Alamat melalui kotak dialog
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");

        // Menampilkan data yang telah dimasukkan dalam kotak pesan
        JOptionPane.showMessageDialog(null, "Data yang dimasukkan:\n" +
                "Nama: " + nama + "\n" +
                "NIM: " + nim + "\n" +
                "Alamat: " + alamat);
    }
}
