import java.util.Scanner;

public class Pemilihan2Percobaan227 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.print("masukkan besar sudut 1:");
        int sudut1 = input27.nextInt();

        System.out.print("masukkan besar sudut 2:");
        int sudut2 = input27.nextInt();

        System.out.print("masukkan besar sudut 3:");
        int sudut3 = input27.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("segitiga tersebut adalah segitiga siku-siku");  
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3){
                System.out.println("segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("segitiga tersebut adalah segitiga sembarang");
            }
        } else
            System.out.println("bukan segitiga");
    }
}