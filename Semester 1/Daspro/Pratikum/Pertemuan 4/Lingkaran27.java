/**
 * Lingkaran27
*/
import java.util.Scanner;

public class Lingkaran27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double phi = 3.14;
        double keliling, luas;
        System.out.print("Masukkan jari-jari lingkaran : ");
        r = input.nextInt();
        keliling = 2 * phi * r;
        luas = phi * r * r;
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah " + phi * r * r);
        System.out.println("Keliling lingkaran dengan jari-jari " + r + " adalah " + 2 * phi * r);

    }
}