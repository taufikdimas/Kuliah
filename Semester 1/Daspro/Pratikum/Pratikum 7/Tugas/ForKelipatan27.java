import java.util.Scanner;

/**
 * ForKelipatan27
 */
public class ForKelipatan27 {

    public static void main(String[] args) {
        Scanner scan27 =  new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan Bilangan kelipatan (1-9) : ");
        kelipatan = scan27.nextInt();

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
        }
        double rataRata = (double) jumlah / counter; // Menghitung rata-rata

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 ada;aj %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);

    }
}