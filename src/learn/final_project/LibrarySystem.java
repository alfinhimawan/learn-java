package learn.final_project;

import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void pinjamBuku() {
        this.dipinjam = true;
    }

    public void kembalikanBuku() {
        this.dipinjam = false;
    }

    @Override
    public String toString() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return "Buku [Judul: " + judul + ", Penulis: " + penulis + ", Status: " + status + "]";
    }
}

class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;

    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku \"" + buku.getJudul() + "\" berhasil ditambahkan ke perpustakaan.");
    }

    public void tampilkanBuku() {
        if (koleksiBuku.isEmpty()) {
            System.out.println("Tidak ada buku di perpustakaan.");
        } else {
            System.out.println("\nDaftar Buku di Perpustakaan:");
            for (int i = 0; i < koleksiBuku.size(); i++) {
                System.out.println((i + 1) + ". " + koleksiBuku.get(i));
            }
        }
    }

    public void pinjamBuku(int indeks) {
        if (indeks < 0 || indeks >= koleksiBuku.size()) {
            System.out.println("Indeks buku tidak valid!");
            return;
        }

        Buku buku = koleksiBuku.get(indeks);
        if (buku.isDipinjam()) {
            System.out.println("Buku \"" + buku.getJudul() + "\" sedang dipinjam.");
        } else {
            buku.pinjamBuku();
            System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dipinjam.");
        }
    }

    public void kembalikanBuku(int indeks) {
        if (indeks < 0 || indeks >= koleksiBuku.size()) {
            System.out.println("Indeks buku tidak valid!");
            return;
        }

        Buku buku = koleksiBuku.get(indeks);
        if (!buku.isDipinjam()) {
            System.out.println("Buku \"" + buku.getJudul() + "\" tidak sedang dipinjam.");
        } else {
            buku.kembalikanBuku();
            System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dikembalikan.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- Sistem Perpustakaan ---");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Daftar Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan Penulis Buku: ");
                    String penulis = scanner.nextLine();
                    Buku buku = new Buku(judul, penulis);
                    perpustakaan.tambahBuku(buku);
                    break;

                case 2:
                    perpustakaan.tampilkanBuku();
                    break;

                case 3:
                    perpustakaan.tampilkanBuku();
                    System.out.print("Masukkan nomor buku yang ingin dipinjam: ");
                    int indeksPinjam = scanner.nextInt() - 1;
                    perpustakaan.pinjamBuku(indeksPinjam);
                    break;

                case 4:
                    perpustakaan.tampilkanBuku();
                    System.out.print("Masukkan nomor buku yang ingin dikembalikan: ");
                    int indeksKembali = scanner.nextInt() - 1;
                    perpustakaan.kembalikanBuku(indeksKembali);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
