package learn.final_project;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Kendaraan {
    private int nomorTiket;
    private String nomorPlat;
    private String jenis;
    private LocalDateTime waktuMasuk;

    public Kendaraan(int nomorTiket, String nomorPlat, String jenis) {
        this.nomorTiket = nomorTiket;
        this.nomorPlat = nomorPlat;
        this.jenis = jenis;
        this.waktuMasuk = LocalDateTime.now();
    }

    public int getNomorTiket() {
        return nomorTiket;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public LocalDateTime getWaktuMasuk() {
        return waktuMasuk;
    }

    @Override
    public String toString() {
        return "Kendaraan [Nomor Tiket: " + nomorTiket + ", Nomor Plat: " + nomorPlat + ", Jenis: " + jenis + "]";
    }
}

class AntrianParkir {
    private Queue<Kendaraan> antrian;
    private int tiketCounter = 1;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public AntrianParkir() {
        this.antrian = new LinkedList<>();
    }

    public void tambahKendaraan(String nomorPlat, String jenis) {
        Kendaraan kendaraan = new Kendaraan(tiketCounter++, nomorPlat, jenis);
        antrian.add(kendaraan);
        System.out.println("Kendaraan dengan plat " + kendaraan.getNomorPlat() + " ditambahkan ke antrian.");
        System.out.println("Nomor Tiket: " + kendaraan.getNomorTiket());
        System.out.println("Waktu Masuk: " + formatter.format(kendaraan.getWaktuMasuk()));
    }

    public void keluarkanKendaraan(Scanner scanner) {
        if (antrian.isEmpty()) {
            System.out.println("Tidak ada kendaraan dalam antrian!");
            return;
        }

        System.out.print("Masukkan Nomor Tiket: ");
        int nomorTiket = scanner.nextInt();
        scanner.nextLine();

        Kendaraan kendaraan = cariKendaraan(nomorTiket);

        if (kendaraan == null) {
            System.out.println("Nomor tiket tidak ditemukan.");
        } else {
            antrian.remove(kendaraan);

            LocalDateTime waktuKeluar = LocalDateTime.now();
            System.out.println("\n--- Kendaraan Keluar ---");
            System.out.println("Nomor Tiket: " + kendaraan.getNomorTiket());
            System.out.println("Nomor Plat: " + kendaraan.getNomorPlat());
            System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
            System.out.println("Waktu Masuk: " + formatter.format(kendaraan.getWaktuMasuk()));
            System.out.println("Waktu Keluar: " + formatter.format(waktuKeluar));

            long durasi = Duration.between(kendaraan.getWaktuMasuk(), waktuKeluar).toMinutes();
            System.out.println("Durasi Parkir: " + durasi + " menit");

            long biaya = hitungBiaya(kendaraan.getJenis(), durasi);
            System.out.println("Total Biaya Parkir: Rp" + biaya);

            prosesPembayaran(scanner, biaya);
        }
    }

    private Kendaraan cariKendaraan(int nomorTiket) {
        for (Kendaraan kendaraan : antrian) {
            if (kendaraan.getNomorTiket() == nomorTiket) {
                return kendaraan;
            }
        }
        return null;
    }

    private long hitungBiaya(String jenis, long durasi) {
        long tarifDasar = jenis.equalsIgnoreCase("Mobil") ? 5000 : 2000;

        return durasi <= 60 ? tarifDasar : tarifDasar + (durasi / 60) * (jenis.equalsIgnoreCase("Mobil") ? 3000 : 1000);
    }

    private void prosesPembayaran(Scanner scanner, long biaya) {
        long pembayaran = 0;
        while (pembayaran < biaya) {
            System.out.print("Masukkan jumlah uang pembayaran (Rp): ");
            pembayaran = scanner.nextLong();
            if (pembayaran < biaya) {
                System.out.println("Uang yang Anda masukkan kurang. Total yang harus dibayar: Rp" + biaya);
            }
        }

        long kembalian = pembayaran - biaya;
        System.out.println("Pembayaran berhasil. Kembalian Anda: Rp" + kembalian);
        System.out.println("Terima kasih dan hati-hati di jalan!\n");
    }

    public void tampilkanAntrian() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian parkir kosong.");
        } else {
            System.out.println("Daftar Kendaraan dalam Antrian:");
            for (Kendaraan kendaraan : antrian) {
                System.out.println(kendaraan + " (Waktu Masuk: " + formatter.format(kendaraan.getWaktuMasuk()) + ")");
            }
        }
    }
}

public class ParkingQueueSystem {
    public static void main(String[] args) {
        AntrianParkir antrianParkir = new AntrianParkir();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        do {
            try {
                System.out.println("\n--- Sistem Antrian Parkir ---");
                System.out.println("1. Tambah Kendaraan ke Antrian");
                System.out.println("2. Keluarkan Kendaraan dari Antrian");
                System.out.println("3. Tampilkan Kendaraan dalam Antrian");
                System.out.println("4. Keluar");
                System.out.print("Masukkan pilihan Anda: ");

                if (scanner.hasNextInt()) {
                    pilihan = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("Input tidak valid! Masukkan angka.");
                    scanner.nextLine();
                    continue;
                }

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan Nomor Plat Kendaraan: ");
                        String nomorPlat = scanner.nextLine();
                        System.out.print("Masukkan Jenis Kendaraan (Mobil/Motor): ");
                        String jenis = scanner.nextLine();
                        antrianParkir.tambahKendaraan(nomorPlat, jenis);
                        break;

                    case 2:
                        antrianParkir.keluarkanKendaraan(scanner);
                        break;

                    case 3:
                        antrianParkir.tampilkanAntrian();
                        break;

                    case 4:
                        System.out.println("=== Terima Kasih Telah Menggunakan Layanan Kami ===");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid! Silakan masukkan angka 1-4.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                scanner.nextLine();
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
