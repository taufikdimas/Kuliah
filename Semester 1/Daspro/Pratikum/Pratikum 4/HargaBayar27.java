import java.util.Scanner;

public class HargaBayar27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku; 

        System.out.print("Masukkan merk buku : ");
        merkBuku = input.nextLine();
        System.out.print("Masukkan jumlah halaman buku : ");
        jmlHalBuku = input.nextInt();
        System.out.print("Masukkan diskon : ");
        dis = input.nextInt();
        System.out.print("Masukkan harga barang : ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        jumlah = input.nextInt();
        total = harga * jumlah;
        jmlDis = total * (dis/100);
        bayar = total - jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " + bayar);
    }
}