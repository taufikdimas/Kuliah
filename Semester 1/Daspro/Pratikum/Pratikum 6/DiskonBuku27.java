import java.util.Scanner;

public class DiskonBuku27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input27.nextLine();
        
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = input27.nextInt();
        
        System.out.print("Masukkan harga per buku: ");
        double hargaPerBuku = input27.nextDouble();
        
        double diskon = 0.0;
        
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.07;
                diskon += 0.02;
            } else if (jumlahBuku <= 3) {
                diskon = 0.01;
            }
        } else if (!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
            diskon = 0.05;
        }
        
        double totalHargaSebelumDiskon = jumlahBuku * hargaPerBuku;
        double totalDiskon = totalHargaSebelumDiskon * diskon;
        double totalHargaSetelahDiskon = totalHargaSebelumDiskon - totalDiskon;
        
        System.out.println("Total harga sebelum diskon: " + totalHargaSebelumDiskon);
        System.out.println("Anda mendapatkan potongan harga : " + totalDiskon);
        System.out.println("Total harga : " + totalHargaSetelahDiskon);
    }
}