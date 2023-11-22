import java.util.Scanner;

public class NilaiMahasiswa27 {
    static Scanner sc27 = new Scanner(System.in);
    static int[][] nilaiMahasiswa = new int[5][7];
    static String[] namaMahasiswa = new String[5];
    static int hariTertinggi = 0;

    public static void main(String[] args) {// Fungsi utama

        inputDataNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);// Memanggil fungsi inputDataNilaiMahasiswa
        tampilkanNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);// Memanggil fungsi tampilkanNilaiMahasiswa
        cariNilaiTertinggi();// Memanggil fungsi cariHariNilaiTertinggi
        mahasiswaNilaiTertinggi();// Memanggil fungsi mahasiswaNilaiTertinggi
    }

    // Fungsi untuk meninginputkan data nilai mahasiswa
    static void inputDataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input nama Mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            System.out.println("Input nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Nilai minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa mulai dari minggu pertama
    // sampai ketujuh
    static void tampilkanNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println(
                "╔════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║ %-15s ║", "Nama Mahasiswa");
        for (int j = 0; j < 7; j++) {
            System.out.printf(" %-10s ║", "Minggu " + (j + 1));
        }
        System.out.println(
                "\n╠════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");

        for (int i = 0; i < 5; i++) {
            System.out.printf("║ %-15s ║", namaMahasiswa[i]);
            for (int j = 0; j < 7; j++) {
                // Change the format specifier from %f to %d
                System.out.printf(" %-10d ║", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }
        System.out.println(
                "╚════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }

    // Fungsi untuk mencari pada minggu keberapa terdapat nilai tertinggi
    public static void cariNilaiTertinggi() {
        double nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < 7; j++) {
            double nilaiMinggu = 0;
            for (int i = 0; i < 5; i++) {
                nilaiMinggu += nilaiMahasiswa[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j;
            }
        }
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
    public static void mahasiswaNilaiTertinggi() {

        cariNilaiTertinggi();
        System.out.println();
        System.out.println("nilai tugas tertinggi pada minggu ke-" + (hariTertinggi + 1) + ":");
        double nilaiTertinggi = 0;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < 5; i++) {
            if (nilaiMahasiswa[i][hariTertinggi] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][hariTertinggi];
                mahasiswaTertinggi = i;
            }
        }

        if (mahasiswaTertinggi != -1) {
            System.out.println("Nama Mahasiswa: " + namaMahasiswa[mahasiswaTertinggi]);
            System.out.println("Nilai pada minggu ke-" + (hariTertinggi + 1) + ": "
                    + nilaiMahasiswa[mahasiswaTertinggi][hariTertinggi]);
        } else {
            System.out.println("Tidak ada mahasiswa dengan nilai tertinggi pada minggu ke-" + (hariTertinggi + 1));
        }
    }
}
