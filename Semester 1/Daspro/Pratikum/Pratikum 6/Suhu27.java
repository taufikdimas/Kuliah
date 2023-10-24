import java.util.Scanner;

public class Suhu27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu saat ini (dalam derajat Celsius): ");
        int suhu = input.nextInt();

        System.out.print("Apakah sedang hujan? (ya/tidak): ");
        String hujan = input.next();

        if (suhu > 27) {
            System.out.println("Sarankan Anda memakai dress.");
            if (hujan.equalsIgnoreCase("ya")) {
                System.out.println("Sarankan Anda membawa payung.");
            } else {
                System.out.println("Sarankan Anda memakai sunscreen.");
            }
        } else {
            System.out.println("Sarankan Anda memakai celana panjang.");
        }

        input.close();
    }
}
