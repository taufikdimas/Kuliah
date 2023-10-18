import java.util.Scanner;

public class BilPosititf27 {
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);
        int jumlah = 0, counter = 0, angka;
        float rata = 0;
        do{
            System.out.println("Masukkan Integer positif (-1 untuk berhenti):");
            angka = scan27.nextInt();
            if (angka >= 0){
                jumlah += angka;
                ++counter;
            }
        }while (angka != -1);
        rata = (float) jumlah / counter;
        System.out.printf("Jumlah dari %d angka adalah %d\n", counter, jumlah);
        System.out.printf("Rata-rata dari %d angka adalah %.3f\n", counter, rata);
    }
}
