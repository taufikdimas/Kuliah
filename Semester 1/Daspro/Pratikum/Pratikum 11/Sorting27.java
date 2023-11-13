import java.util.Arrays;

public class Sorting27 {
    public static void main(String[] args) {
        String[][] data = {
            {"Badminton", "Taufik", "Pasha", "Farrel", "Petrus", "Innama"},
            {"Basket", "Dimas", "Ata", "Farhan", "Dio", "vira"},
            {"Bola Voli", "Mera", "Cindy", "Rangga", "Rio", "Ivan"},
            {"Tenis Meja", "Chiko", "Saka", "Abdillah", "Adri", "Naufal"}
        };
        
        for (String[] cabor : data) {
            System.out.println("Cabang olahraga: " + cabor[0]);

            // Mengurutkan atlit dalam masing-masing cabor
            Arrays.sort(cabor, 1, cabor.length);
            // Menampilkan atlit
            for (int i = 1; i <= cabor.length - 1; i++) {
                System.out.println("Atlet ke-" + i + ": " + cabor[i]);
            }
        }
    }
}
