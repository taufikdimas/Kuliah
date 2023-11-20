public class TerimaKasih_27 {
    public static void main(String[] args) {// memanggil fungsi
        UcapanTerimaKasih();
        System.out.println("Tanpa Menggunakan Fungsi\n" + "thank you for being the best teacher in the world.\n" +
                "you inspired in me a love for learning and made me feel like i could ask you anything.");
        String ucapan = "Terima Kasih Pak... Bu... semoga sehat selalu\n" + "Bismillah A";
        UcapanTambahan(ucapan);
    }

    public static void UcapanTerimaKasih() {// percobaan1
        System.out.println("Menggunakan Fungsi\n" + "thank you for being the best teacher in the world.\n" +
                "you inspired in me a love for learning and made me feel like i could ask you anything.");
    }

    static void UcapanTambahan(String ucapan) {// percobaan 2
        System.out.println(ucapan);
    }

}