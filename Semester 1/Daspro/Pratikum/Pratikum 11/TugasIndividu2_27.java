import java.util.Scanner;

public class TugasIndividu2_27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = sc27.nextInt();

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}