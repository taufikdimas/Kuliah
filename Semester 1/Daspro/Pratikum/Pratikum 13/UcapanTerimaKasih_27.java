import java.util.Scanner;

//percobaan 4
public class UcapanTerimaKasih_27 {
    public static String PenerimaUcapan() {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA yang ingin Anda beri ucapan :");
        String namaOrang = sc27.nextLine();
        sc27.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("thank you " + nama + " for being the best teacher in the world.\n" +
                "you inspired in me a love for learning and made me feel like i could ask you anything.");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
