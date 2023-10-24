import java.util.Scanner;

public class Gaji27 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int jmMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.print("Masukan Gaji anda : ");
        gaji=input.nextInt();
        System.out.print("Masukan Potongan Gaji anda : ");
        potGaji=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmMasuk=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        JmlTdkMasuk=input.nextInt();
        TotGaji=(jmMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.print("Gaji yang anda terima adalah : "+TotGaji);
    }
}