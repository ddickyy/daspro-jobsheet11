import java.util.Scanner;

public class Kafe08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);

        double totalKeseluruhan = 0;

        while (true) {
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        
        if (pilihanMenu == 0) {
            break;
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int hargaTotal = hitungTotalHarga(pilihanMenu, banyakItem);
        totalKeseluruhan += hargaTotal;
    }
        System.out.print("Masukkan kode promo: ");
        sc.nextLine();
        String kodePromo = sc.nextLine();

        double totalSetelahDiskon = totalPromo(totalKeseluruhan, kodePromo);

        System.out.printf("Total harga setelah diskon: Rp%.2f%n", totalSetelahDiskon);
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp15,000");
        System.out.println("2. Cappuccino - Rp20,000");
        System.out.println("3. Latte - Rp22,000");
        System.out.println("4. Teh Tarik - Rp12,000");
        System.out.println("5. Roti Bakar - Rp10,000");
        System.out.println("6. Mie Goreng - Rp18,000");
        System.out.println("0. Selesai");
        System.out.println("==========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static double totalPromo(double totalHarga, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalHarga *= 0.5;
            System.out.println("Kode promo 'DISKON50' diterima! Anda mendapatkan diskon sebesar 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalHarga *= 0.3;
            System.out.println("Kode promo 'DISKON30' diterima! Anda mendapatkan diskon sebesar 30%.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }
        return totalHarga;
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
}
