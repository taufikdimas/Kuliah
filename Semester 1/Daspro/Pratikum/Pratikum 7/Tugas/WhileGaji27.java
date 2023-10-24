import java.util.Scanner;

public class WhileGaji27 {
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String Jabatan;

        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan = scan27.nextInt();

        int i = 0;

        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukan Jabatan Karyawan ke-" + (i+1) + ":");
            Jabatan = scan27.next();
            System.out.print("Masukkan Jumlah Jam Lembur : ");
            jumlahJamLembur = scan27.nextInt();
            i++;
            

            if (Jabatan.equalsIgnoreCase("Direktur")){
                continue;
            } else if (Jabatan.equalsIgnoreCase("Manajer")){
               gajiLembur = jumlahJamLembur * 100000;
            } else if (Jabatan.equalsIgnoreCase("Karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }else{
                System.out.println("Jabatan tidak tersedia");
                i--;
                continue;
            }
            totalGajiLembur += gajiLembur;
            
          
        }
        System.out.println("Total gaji lembur : " + totalGajiLembur);

    }
}
