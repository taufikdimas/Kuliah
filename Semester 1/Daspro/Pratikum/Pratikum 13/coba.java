import java.util.Arrays;
import java.util.Scanner;

public class coba {

    static int[][] nilaiTugas = new int[100][100];

    static Scanner sc = new Scanner(System.in);
    static int jumlahMahasiswa = 0;
    static int jumlahTugas = 0;

    public static void inputNilai() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = sc.nextInt();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke " + (i + 1));
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai tugas minggu ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = sc.nextInt();
            }
        }
    }

    public static void Tampil() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ", Tugas ke-" + (j + 1) +
                        ": " + nilaiTugas[i][j]);
            }
        }
    }

    public static void SortHari() {
        int nilaiTertinggi = 0;
        int indexMinggu = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    indexMinggu = j + 1;
                }
            }
            System.out.println("Nilai tertinggi pada minggu ke- " + (i + 1) + " adalah " + nilaiTertinggi);
            nilaiTertinggi = 0;
        }
    }

    public static void NilaiTertinggi() {
        int nilaiTertinggi = 0;
        int indexMahasiswa = -1;
        int indexMinggu = 0;
        int nilaiTotal = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    indexMahasiswa = i + 1;
                    indexMinggu = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke- " + indexMahasiswa);
        System.out.println("Mendapatkan nilai " + nilaiTertinggi + " pada minggu ke- " + indexMinggu);
    }

    public static void main(String[] args) {

        int Menu = 0;
        boolean isLoop = true;

        while (isLoop) {
            System.out.println("═══════════════════════════════════════");
            System.out.println("Menu");
            System.out.println("═══════════════════════════════════════");
            System.out.println("[1] Input Nilai Mahasiswa");
            System.out.println("[2] Menampilkam Nilai Mahasiswa");
            System.out.println("[3] Mencari hari dengan nilai tertinggi");
            System.out.println("[4] Mahasiswa dengan nilai tertinggi");
            System.out.println("═══════════════════════════════════════");

            System.out.print("Masukkan Pilihan: ");
            Menu = sc.nextInt();
            sc.nextLine();

            switch (Menu) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    Tampil();
                    break;
                case 3:
                    SortHari();
                    break;
                case 4:
                    NilaiTertinggi();
                    break;
                default:
                    break;
            }
        }
    }
}