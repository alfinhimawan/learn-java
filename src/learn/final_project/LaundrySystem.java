package learn.final_project;

import java.util.ArrayList;
import java.util.Scanner;

class Pelanggan {
    private String nama;
    private String alamat;
    private String noTelepon;

    public Pelanggan(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    @Override
    public String toString() {
        return "Pelanggan [Nama: " + nama + ", Alamat: " + alamat + ", No. Telepon: " + noTelepon + "]";
    }
}

class LayananLaundry {
    private String jenisLayanan;
    private double harga;

    public LayananLaundry(String jenisLayanan, double harga) {
        this.jenisLayanan = jenisLayanan;
        this.harga = harga;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return jenisLayanan + " - Harga: Rp " + harga;
    }
}

class Laundry {
    private ArrayList<LayananLaundry> layananList;
    private ArrayList<Pelanggan> pelangganList;
    private ArrayList<String> transaksi;
    private ArrayList<String> statusLaundry;

    public Laundry() {
        layananList = new ArrayList<>();
        pelangganList = new ArrayList<>();
        transaksi = new ArrayList<>();
        statusLaundry = new ArrayList<>();
        
        layananList.add(new LayananLaundry("Cuci Kering", 10000)); 
        layananList.add(new LayananLaundry("Cuci Basah", 8000)); 
        layananList.add(new LayananLaundry("Cuci Setrika", 12000)); 
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
        System.out.println("Pelanggan \"" + pelanggan.getNama() + "\" berhasil ditambahkan.");
    }

    public void tampilkanLayanan() {
        if (layananList.isEmpty()) {
            System.out.println("Tidak ada layanan yang tersedia.");
        } else {
            System.out.println("\nDaftar Layanan Laundry:");
            for (int i = 0; i < layananList.size(); i++) {
                System.out.println((i + 1) + ". " + layananList.get(i));
            }
        }
    }

    public void tampilkanPelanggan() {
        if (pelangganList.isEmpty()) {
            System.out.println("Tidak ada pelanggan.");
        } else {
            System.out.println("\nDaftar Pelanggan:");
            for (int i = 0; i < pelangganList.size(); i++) {
                System.out.println((i + 1) + ". " + pelangganList.get(i));
            }
        }
    }

    public void transaksiLaundry(int pelangganIndex, int layananIndex, double berat) {
        if (pelangganIndex < 0 || pelangganIndex >= pelangganList.size()) {
            System.out.println("Pelanggan tidak ditemukan!");
            return;
        }

        if (layananIndex < 0 || layananIndex >= layananList.size()) {
            System.out.println("Layanan tidak ditemukan!");
            return;
        }

        Pelanggan pelanggan = pelangganList.get(pelangganIndex);
        LayananLaundry layanan = layananList.get(layananIndex);
        double totalBiaya = layanan.getHarga() * berat;

        String transaksiDetail = "Pelanggan: " + pelanggan.getNama() + ", Layanan: " + layanan.getJenisLayanan() +
                ", Berat: " + berat + " kg, Total Biaya: Rp " + totalBiaya;
        transaksi.add(transaksiDetail);
        statusLaundry.add("Baru");
        System.out.println("Transaksi untuk pelanggan \"" + pelanggan.getNama() + "\" berhasil dilakukan.");
        System.out.println("Total Biaya: Rp " + totalBiaya);

        bayarLaundry(totalBiaya);
    }

    public void bayarLaundry(double totalBiaya) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan uang yang dibayar: Rp ");
        double uangDibayar = scanner.nextDouble();

        if (uangDibayar < totalBiaya) {
            System.out.println("Uang yang dibayar kurang! Pembayaran gagal.");
        } else {
            double kembalian = uangDibayar - totalBiaya;
            System.out.println("Pembayaran berhasil! Kembalian Anda: Rp " + kembalian);
            statusLaundry.set(statusLaundry.size() - 1, "Proses");
        }
    }

    public void ambilLaundry(int transaksiIndex) {
        if (transaksiIndex < 0 || transaksiIndex >= statusLaundry.size()) {
            System.out.println("Transaksi tidak ditemukan!");
            return;
        }
        statusLaundry.set(transaksiIndex, "Selesai");
        System.out.println("Laundry telah diambil. Terima kasih!");
    }

    public void tampilkanTransaksi() {
        if (transaksi.isEmpty()) {
            System.out.println("Tidak ada transaksi yang dilakukan.");
        } else {
            System.out.println("\nDaftar Transaksi Laundry:");
            for (int i = 0; i < transaksi.size(); i++) {
                System.out.println((i + 1) + ". " + transaksi.get(i) + ", Status: " + statusLaundry.get(i));
            }
        }
    }
}

public class LaundrySystem {
    public static void main(String[] args) {
        Laundry laundry = new Laundry();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- Sistem Laundry ---");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Tampilkan Daftar Layanan");
            System.out.println("3. Tampilkan Daftar Pelanggan");
            System.out.println("4. Transaksi Laundry");
            System.out.println("5. Tampilkan Transaksi");
            System.out.println("6. Ambil Laundry (Selesai)");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Alamat Pelanggan: ");
                    String alamat = scanner.nextLine();
                    System.out.print("Masukkan No Telepon Pelanggan: ");
                    String noTelepon = scanner.nextLine();
                    Pelanggan pelanggan = new Pelanggan(nama, alamat, noTelepon);
                    laundry.tambahPelanggan(pelanggan);
                    break;

                case 2:
                    laundry.tampilkanLayanan();
                    break;

                case 3:
                    laundry.tampilkanPelanggan();
                    break;

                case 4:
                    laundry.tampilkanPelanggan();
                    System.out.print("Pilih nomor pelanggan: ");
                    int pelangganIndex = scanner.nextInt() - 1;

                    laundry.tampilkanLayanan();
                    System.out.print("Pilih nomor layanan: ");
                    int layananIndex = scanner.nextInt() - 1;

                    System.out.print("Masukkan berat pakaian (kg): ");
                    double berat = scanner.nextDouble();

                    laundry.transaksiLaundry(pelangganIndex, layananIndex, berat);
                    break;

                case 5:
                    laundry.tampilkanTransaksi();
                    break;

                case 6:
                    laundry.tampilkanTransaksi();
                    System.out.print("Pilih nomor transaksi yang telah selesai: ");
                    int transaksiIndex = scanner.nextInt() - 1;
                    laundry.ambilLaundry(transaksiIndex);
                    break;

                case 7:
                    System.out.println("Terima kasih telah menggunakan sistem laundry!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 7);

        scanner.close();
    }
}