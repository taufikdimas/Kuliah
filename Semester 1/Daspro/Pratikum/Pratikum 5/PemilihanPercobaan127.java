/**
 * PemilihanPercobaan127
 */
import java.util.Scanner;

public class PemilihanPercobaan127 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        
        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.print("Angka " + angka + " adalah bilangan " + jenisAngka);
    }
}