import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String [][] penonton = new String[4][2];
        
        while (true) {
            System.out.print("Masukkan Nama : ");
            nama =sc27.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = sc27.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = sc27.nextInt();
            sc27.nextLine();

            penonton[baris-1][kolom-1]= nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = sc27.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }

        }
    }
}
