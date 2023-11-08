import java.util.Scanner;

public class TugasIndividuTeori27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        for (int baris = tinggi; baris >= 1; baris--) {
            for (int spasi = 0; spasi < tinggi - baris; spasi++) {
                System.out.print("  "); // Mencetak spasi
            }
            for (int bintang = 1; bintang <= 2 * baris - 1; bintang++) {
                System.out.print("* "); // Mencetak bintang
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
