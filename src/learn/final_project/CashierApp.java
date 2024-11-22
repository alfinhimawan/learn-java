package learn.final_project;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " x" + quantity + " - Rp" + totalPrice();
    }
}

class CashierSystem {
    private ArrayList<Item> cart;

    public CashierSystem() {
        cart = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        cart.add(item);
        System.out.println("Item '" + name + "' berhasil ditambahkan ke keranjang.");
    }

    public void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Keranjang belanja kosong.");
        } else {
            System.out.println("\nKeranjang Belanja:");
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i + 1) + ". " + cart.get(i));
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : cart) {
            total += item.totalPrice();
        }
        return total;
    }

    public double applyDiscount(double total) {
        double discount = 0;
        if (total > 100000) {
            discount = total * 0.1;
        }
        return discount;
    }

    public void processPayment() {
        double total = calculateTotal();
        double discount = applyDiscount(total);
        double finalTotal = total - discount;

        System.out.println("\nTotal Belanja: Rp" + total);
        if (discount > 0) {
            System.out.println("Diskon: Rp" + discount);
        }
        System.out.println("Total yang harus dibayar: Rp" + finalTotal);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Masukkan jumlah pembayaran: Rp");
                double payment = scanner.nextDouble();
                if (payment >= finalTotal) {
                    double change = payment - finalTotal;
                    System.out.println("Pembayaran berhasil. Kembalian Anda: Rp" + change);
                    printReceipt(total, discount, payment, change);
                    break;
                } else {
                    System.out.println("Pembayaran tidak cukup. Coba lagi.");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.next(); 
            }
        }
    }

    public void printReceipt(double total, double discount, double payment, double change) {
        System.out.println("\n======= STRUK PEMBELIAN =======");
        showCart();
        System.out.println("\nTotal Belanja: Rp" + total);
        if (discount > 0) {
            System.out.println("Diskon: Rp" + discount);
        }
        System.out.println("Total Bayar: Rp" + payment);
        System.out.println("Kembalian: Rp" + change);
        System.out.println("===============================");
    }
}

public class CashierApp {
    public static void main(String[] args) {
        CashierSystem cashier = new CashierSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistem Kasir");
            System.out.println("1. Tambah barang");
            System.out.println("2. Lihat keranjang");
            System.out.println("3. Proses pembayaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            if (choice == 1) {
                System.out.print("Masukkan nama barang: ");
                String name = scanner.nextLine();
                System.out.print("Masukkan harga barang: Rp");
                double price = scanner.nextDouble();
                System.out.print("Masukkan jumlah barang: ");
                int quantity = scanner.nextInt();
                cashier.addItem(name, price, quantity);
            } else if (choice == 2) {
                cashier.showCart();
            } else if (choice == 3) {
                cashier.showCart();
                cashier.processPayment();
                break; 
            } else if (choice == 4) {
                System.out.println("Terima kasih telah menggunakan sistem kasir!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
