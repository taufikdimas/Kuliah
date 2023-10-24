import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa :");
        int jmlMhs = sc27.nextInt();
 
        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totaltdklulus = 0;
        double ratalulus, ratatdkLulus;
        int jmllulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai Mahasiswa ke-" + i+1+ ":");
            nilaiMhs[i] = sc27.nextInt();
        }
        for (int i =0 ; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                jmllulus++;
            }else{
                totaltdklulus += nilaiMhs[i];
            }
        }
        ratalulus = totalLulus / jmllulus;
        ratatdkLulus = totaltdklulus / (nilaiMhs.length - jmllulus);
        System.out.println("Rata-rata nilai lulus = " + ratalulus);
        System.out.print("Rata-rata nilai tidak lulus = " + ratatdkLulus);
    }
}
