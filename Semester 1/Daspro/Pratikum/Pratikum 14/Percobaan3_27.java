import java.util.Scanner;

public class Percobaan3_27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc27.nextDouble();
        System.out.print("Lamanya investasi (tahun) :");
        tahun = sc27.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
}
