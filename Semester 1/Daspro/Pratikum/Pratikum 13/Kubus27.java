import java.util.Scanner;

public class Kubus27 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc27.nextDouble();

        double volume = VolumeKubus(sisi);
        double luasPermukaan = LuasPermukaanKubus(sisi);

        System.out.println("Volume kubus        : " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }

    // Fungsi untuk menghitung volume kubus
    public static double VolumeKubus(double sisi) {
        return Math.pow(sisi, 3);
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static double LuasPermukaanKubus(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
}
