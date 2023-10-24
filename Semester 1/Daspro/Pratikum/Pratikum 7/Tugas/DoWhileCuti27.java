import java.util.Scanner;

/**
 * DoWhileCuti27
 */
public class DoWhileCuti27 {

    public static void main(String[] args) {
        Scanner scan27 =  new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti : ");
        jatahCuti = scan27.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t)?");
            konfirmasi = scan27.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari : ");
                jumlahHari = scan27.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
    
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi ");
                }
            }else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("program selesai");
                break;
            }
        
        }while (jatahCuti > 0);
    }
}