import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc27.nextInt();
            sc27.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    nama = sc27.nextLine();
                    
                    while (true) {
                        System.out.print("Masukkan Baris: ");
                        baris = sc27.nextInt();
                        System.out.print("Masukkan Kolom: ");
                        kolom = sc27.nextInt();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom kursi tidak tersedia.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi tersebut sudah ditempati oleh penonton lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                            break; // Keluar dari loop saat data berhasil dimasukkan
                        }
                    }
                    sc27.nextLine(); 
                    break;
                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}
