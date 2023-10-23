import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai Mahasiswa ke-" + i+ ":");
            nilaiMhs[i] = sc27.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total = total + nilaiMhs[i];
        }
        rata2 = total / nilaiMhs.length;
        System.out.print("Rata-rata nilai = " + rata2);


    }
}
