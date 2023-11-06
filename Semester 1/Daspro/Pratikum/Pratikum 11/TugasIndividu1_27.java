import java.util.Scanner;

public class TugasIndividu1_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai N
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        // Validasi nilai N
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3!");
            return;
        }

        // Cetak segitiga angka
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
