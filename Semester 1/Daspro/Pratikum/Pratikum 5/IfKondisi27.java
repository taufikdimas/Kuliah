/**
 * IfKondisi27
 */
import java.util.Scanner;

public class IfKondisi27 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukan Suhu : ");
        int suhu = sc27.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket ");
        }
        if (suhu < 20) {
            System.out.println("Silahkan pakai baju tebal ");
        }
        else{
            System.out.println("Silahkan pakai pakai topi");
        }
    }
}