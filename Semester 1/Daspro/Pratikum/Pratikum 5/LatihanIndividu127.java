import java.util.Scanner;

/**
 * LatihanIndividu127
 */
public class LatihanIndividu127 {

    public static void main(String[] args) {
        Scanner Input27 = new Scanner(System.in);

        System.out.print("Masukkan jarak: ");
        int Jarak = Input27.nextInt();

        if (Jarak <= 5) {
            System.out.print("Gunakan Melee Weapon");
        }else if (Jarak > 5) {
            System.out.print("Gunakan Ranged Weapon");
        }
    }
}