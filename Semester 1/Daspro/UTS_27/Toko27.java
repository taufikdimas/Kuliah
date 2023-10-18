import java.util.Scanner;

public class Toko27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Program Toko =====");
        System.out.print("Masukkan nama anda: ");
        String namaPelanggan = input.nextLine();
        
        boolean isMember = false;
        double totalHargaSebelumDiskon = 0;
        double totalDiskon = 0;
        int totalItemBarang = 0;
        
        do {
            System.out.print("Masukkan produk yang anda beli: ");
            String produk = input.next();
            System.out.print("Banyaknya: ");
            int kuantitas = input.nextInt();
            System.out.print("Harga: ");
            double hargaSatuan = input.nextDouble();
            System.out.print("Diskon(%): ");
            double diskonProduk = input.nextDouble();

            double subtotal = kuantitas * hargaSatuan;
            double diskon = subtotal * (diskonProduk / 100);

            totalItemBarang += kuantitas;
            totalHargaSebelumDiskon += subtotal;
            totalDiskon += diskon;

            System.out.print("Apakah anda mau menambahkan produk (Y/N)? ");
            String tambahProduk = input.next();

            if (tambahProduk.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);

        System.out.print("Apakah anda punya kartu member(Y/N)? ");
        String member = input.next();
        if (member.equalsIgnoreCase("y") && totalHargaSebelumDiskon >= 200000) {
            isMember = true;
            totalDiskon += totalHargaSebelumDiskon * 0.1;
        } else if (member.equalsIgnoreCase("y")) {
            isMember = true;
            totalDiskon += totalHargaSebelumDiskon * 0.05;
        }

        double totalAkhir = totalHargaSebelumDiskon - totalDiskon;

        System.out.println("\n===== Total Pembelian =====");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Tipe Pelanggan: " + (isMember ? "Member" : "Non-Member"));
        System.out.println("Total Item Barang: " + totalItemBarang);
        System.out.println("Total Harga Sebelum Diskon: " + totalHargaSebelumDiskon);
        System.out.println("Total Diskon: " + totalDiskon);
        System.out.println("Total Akhir yang Harus Dibayar: " + totalAkhir);
        System.out.println("==================================");

        input.close();
    }
}
