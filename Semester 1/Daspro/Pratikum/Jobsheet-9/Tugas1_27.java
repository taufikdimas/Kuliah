import java.util.Scanner;

public class Tugas1_27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        //menginputkan banyaknya elemen
        System.out.print("Masukkan banyaknya elemen :");
        int jmlElem = sc27.nextInt();
        
        int [] nilaiElem = new int[jmlElem];
        double total = 0;
        double rata2;
        //input nilai tiap elemen
        for (int i = 0; i < nilaiElem.length; i++){
            System.out.print("nilai elemen ke- "+(i+1)+":");
            nilaiElem[i] = sc27.nextInt();
        }

        //nilai tertinggi
        for (int i = 0; i < nilaiElem.length; i++){
            if (nilaiElem[i] > total){
                total = nilaiElem[i];
            }
        }
        System.out.println("Nilai tertinggi : " + total);
        // nilai terendah
        for (int i = 0; i < nilaiElem.length; i++){
            if (nilaiElem[i] < total){
                total = nilaiElem[i];
            }
        }
        System.out.println("Nilai terendah : " + total);    
        // nilai rata-rata
        for (int i = 0; i < nilaiElem.length; i++){
            total += nilaiElem[i];
        }
        rata2 = total / nilaiElem.length;
        System.out.println("Nilai rata-rata : " +rata2);

    }
}
