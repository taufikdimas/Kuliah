import java.util.Scanner;

public class Bank27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga, jml_tabungan_akhir; 
        System.out.print("masukan jumlah tabungan awal anda : ");
        jml_tabungan_awal = input.nextInt();
        System.out.print("masukan lama menabung anda : ");
        lama_menabung= input.nextInt();
        bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;
        System.out.print("jumlah tabungan akhir anda adalah : " +jml_tabungan_akhir);

    }
}