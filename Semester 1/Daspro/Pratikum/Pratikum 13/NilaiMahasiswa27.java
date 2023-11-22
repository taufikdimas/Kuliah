import java.util.Scanner;

public class NilaiMahasiswa27 {
    static Scanner sc27 = new Scanner(System.in);
    static int[][] nilaiMahasiswa;
    static String[] namaMahasiswa;
    static int jumlahMahasiswa;
    static int jumlahTugas;
    static int hariTertinggi = 0;

    public static void main(String[] args) {
        inputJumlahMahasiswaTugas(); // Memanggil fungsi inputJumlahMahasiswaTugas
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        namaMahasiswa = new String[jumlahMahasiswa];

        inputDataNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);
        tampilkanNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);
        cariNilaiTertinggi();
        mahasiswaNilaiTertinggi();
    }

    // Fungsi untuk input jumlah mahasiswa dan jumlah tugas
    static void inputJumlahMahasiswaTugas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input jumlah mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();
        System.out.print("Input jumlah tugas: ");
        jumlahTugas = scanner.nextInt();
    }

    static void inputDataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Input nama Mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            System.out.println("Input nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Clear the buffer
        }
    }

    static void tampilkanNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println(
                "╔════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║ %-15s ║", "Nama Mahasiswa");
        for (int j = 0; j < jumlahTugas; j++) {
            System.out.printf(" %-10s ║", "Tugas " + (j + 1));
        }
        System.out.println(
                "\n╠════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("║ %-15s ║", namaMahasiswa[i]);
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.printf(" %-10d ║", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }
        System.out.println(
                "╚════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }

    public static void cariNilaiTertinggi() {
        double nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < jumlahTugas; j++) {
            double nilaiMinggu = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                nilaiMinggu += nilaiMahasiswa[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j;
            }
        }
    }

    public static void mahasiswaNilaiTertinggi() {
        cariNilaiTertinggi();
        System.out.println();
        System.out.println("Nilai tugas tertinggi pada tugas ke-" + (hariTertinggi + 1) + ":");
        double nilaiTertinggi = 0;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i][hariTertinggi] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][hariTertinggi];
                mahasiswaTertinggi = i;
            }
        }

        if (mahasiswaTertinggi != -1) {
            System.out.println("Nama Mahasiswa: " + namaMahasiswa[mahasiswaTertinggi]);
            System.out.println("Nilai pada tugas ke-" + (hariTertinggi + 1) + ": " +
                    nilaiMahasiswa[mahasiswaTertinggi][hariTertinggi]);
        } else {
            System.out.println("Tidak ada mahasiswa dengan nilai tertinggi pada tugas ke-" + (hariTertinggi + 1));
        }
    }
}
