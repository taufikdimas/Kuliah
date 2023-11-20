import java.util.Scanner;

public class Percobaan6_27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int p, l, t, L, L2, vol2, vol;

        System.out.print("Masukkan panjang :");
        p = sc27.nextInt();
        System.out.print("Masukkan lebar :");
        l = sc27.nextInt();
        System.out.print("Masukkan tinggi :");
        t = sc27.nextInt();

        System.out.println("===tanpa fungsi===");
        L = p * l;
        System.out.println("Luas Persegi Panjang adalah= " + L);
        vol = p * l * t;
        System.out.println("Volume Balok adalah= " + vol);
        System.out.println("===dengan fungsi===");
        L2 = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah= " + L2);
        vol2 = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah= " + vol2);
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}
