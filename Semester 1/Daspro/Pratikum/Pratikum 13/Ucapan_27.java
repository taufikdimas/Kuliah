import java.util.Scanner;

public class Ucapan_27 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }

    public static String PenerimaUcapan() {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan :");
        String namaOrang = sc27.nextLine();
        sc27.close();
        return namaOrang;
    }

}
