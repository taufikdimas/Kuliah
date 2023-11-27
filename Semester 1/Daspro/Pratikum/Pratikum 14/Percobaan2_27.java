import java.util.Scanner;

public class Percobaan2_27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung :");
        bilangan = sc27.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc27.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.print(bilangan);// mencetak deret perhitungan pangkatnya
        for (int i = 1; i < pangkat; i++) {
            System.out.print(" x " + bilangan);
        }
        System.out.print(" = " + hasil);
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
}
