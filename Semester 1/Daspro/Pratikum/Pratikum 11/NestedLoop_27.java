import java.util.Scanner;

public class NestedLoop_27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        double[][] temps = new double[5][7];


        for (int i = 0; i < temps.length; i++){
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < temps[0].length; j++){
                System.out.print("Hari ke-"+ (j+1)+" : ");
                temps[i][j] = sc27.nextDouble();
            }
            System.out.println();
        }
        //menggunakan array foraech
        for (double[] row : temps) {
            System.out.print("Kota ke-" +(temps[0].length + 1));
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
         // hitung nilai rata-rata masing-masing kota
        double[] rata1 = new double[temps.length];
        for (int i = 0; i < temps.length; i++) {
            double rata2 = 0;
            for (int j = 0; j < temps[0].length; j++) {
                rata2 += temps[i][j];
            }
            rata2 /= temps[0].length;
            rata1[i] = rata2;
        }

        // tampilkan nilai rata-rata masing-masing kota
        System.out.println("Rata-rata suhu masing-masing kota:");
        for (int i = 0; i < rata1.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": " + rata1[i]);
        }
    }
}
