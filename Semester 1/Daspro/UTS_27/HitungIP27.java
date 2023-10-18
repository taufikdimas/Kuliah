import java.text.DecimalFormat;
import java.util.Scanner;

public class HitungIP27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00"); // Format untuk dua desimal

        System.out.println("===== Program Hitung IP =====");
        System.out.print("Masukkan nama : ");
        String namaMahasiswa = input.nextLine();

        double totalNilai = 0.0;
        int totalSKS = 0;
        int mataKuliahRemidi = 0;
        int jumlahMataKuliah = 0;

        boolean lanjutInput = true;

        while (lanjutInput) {
            System.out.print("Nama Mata kuliah: ");
            String namaMataKuliah = input.nextLine();

            System.out.print("Nilai (A, B+, B, C+, C, D, E): ");
            String nilai = input.next();
            double indeksNilai = 0.0;

            switch (nilai) {
                case "A":
                    indeksNilai = 4.0;
                    break;
                case "B+":
                    indeksNilai = 3.5;
                    break;
                case "B":
                    indeksNilai = 3.0;
                    break;
                case "C+":
                    indeksNilai = 2.5;
                    break;
                case "C":
                    indeksNilai = 2.0;
                    break;
                case "D":
                    indeksNilai = 1.0;
                    mataKuliahRemidi++;
                    break;
                case "E":
                    indeksNilai = 0.0;
                    mataKuliahRemidi++;
                    break;
                default:
                    System.out.println("Nilai tidak valid. Nilai diabaikan.");
                    continue; // Skip iterasi ini jika nilai tidak valid
            }

            System.out.print("Masukkan jumlah SKS : ");
            int sks = input.nextInt();

            totalNilai += indeksNilai * sks;
            totalSKS += sks;
            jumlahMataKuliah++;

            System.out.print("Lanjut input nilai mata kuliah? (Y/N): ");
            String lanjut = input.next();

            if (lanjut.equalsIgnoreCase("n")) {
                lanjutInput = false;
            }

            input.nextLine(); // Membersihkan newline
        }

        double ip = totalNilai / totalSKS;

        System.out.println("===== Hasil Perhitungan IP =====");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP): " + decimalFormat.format(ip)); // Menampilkan IP dengan dua desimal
        System.out.println("Jumlah Mata Kuliah: " + jumlahMataKuliah);
        System.out.println("Jumlah SKS: " + totalSKS);
        System.out.println("Jumlah MK yang harus perbaikan/remidi: " + mataKuliahRemidi);
        System.out.println("===================================");

        input.close();
    }
}
