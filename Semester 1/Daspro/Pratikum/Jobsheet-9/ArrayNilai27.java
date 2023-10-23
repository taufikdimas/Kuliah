import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {
        int[] nilaiakhir = new int[10];

        Scanner sc27 = new Scanner(System.in);

        for (int i = 0; i < nilaiakhir.length; i++ ){
            System.out.print("Masukkan nilai akhir ke-"+i+":");
            nilaiakhir[i] = sc27.nextInt();
        }
        for (int i =0; i < nilaiakhir.length; i++){
            if (nilaiakhir[i] > 70){
                System.out.println("Mahasiswa ke- "+i+"lulus");
            } else{
                System.out.println("Mahasiswa ke- "+i+"tidak lulus");
            }
        }
    }
}
