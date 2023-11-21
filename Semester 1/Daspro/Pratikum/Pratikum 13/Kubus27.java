import java.util.Scanner;

public class Kubus27 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int s = sc27.nextInt();// s = sisi

        int volume = VolumeKubus(s);
        int luasPermukaan = LuasPermukaanKubus(s);

        System.out.println("Volume kubus        : " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }

    // Fungsi untuk menghitung volume kubus
    public static int VolumeKubus(int s) {
        return s * s * s;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static int LuasPermukaanKubus(int s) {
        return 6 * s * s;
    }
}
