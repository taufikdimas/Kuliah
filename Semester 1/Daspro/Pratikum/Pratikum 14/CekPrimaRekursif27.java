import java.util.Scanner;

public class CekPrimaRekursif27 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan suatu bilangan: ");
        int n = sc27.nextInt();

        if (cekPrimaRekursif(n)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    // Fungsi rekursif untuk mengecek apakah suatu bilangan adalah bilangan prima
    static boolean cekPrimaRekursif(int n, int divisor) {
        if (n <= 1) {
            return false;
        } else if (divisor == 1) {
            return true;
        } else {
            if (n % divisor == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, divisor - 1);
            }
        }
    }

    // Overloaded method untuk memulai rekursi dengan divisor awal n - 1
    static boolean cekPrimaRekursif(int n) {
        return cekPrimaRekursif(n, n - 1);
    }
}
