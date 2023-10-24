/**
 * PemilihanPercobaan227
 */
import java.util.Scanner;

public class PemilihanPercobaan227 {

    public static void main(String[] args) {
       Scanner input27 = new Scanner(System.in);

        System.out.print("Nilai UAS   : ");
        float uas = input27.nextFloat();
        System.out.print("Nilai UTS   : ");
        float uts = input27.nextFloat();
        System.out.print("Nilai Kuis  : ");
        float kuis = input27.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = input27.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        if (total >= 80 && total <=100) {
            System.out.println("Nilai Huruf  : A");  
        }else if (total >= 73 && total < 80) {
            System.out.println("Nilai Huruf  : B+");
        }else if (total >= 70 && total < 73) {
            System.out.println("Nilai Huruf  : B");
        }else if (total >= 65 && total < 70) {
            System.out.println("Nilai Huruf  : C+");
        }else if (total >= 60 && total < 65) {
            System.out.println("Nilai Huruf  : C");
        }else if (total >= 50 && total < 60) {
            System.out.println("Nilai Huruf  : D");
        }else { //total < 50
            System.out.println("Nilai Huruf  : E");
        }
        
        System.out.println("Nilai Akhir = " + total + " ssehingga " + message);
    }
}