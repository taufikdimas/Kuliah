import java.util.Scanner;

public class Pemilihan2Percobaan127 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        System.out.print("masukkan tahun :");
        
        int tahun = input27.nextInt();

        if ((tahun % 4 ) == 0) {
            if ((tahun % 100) != 0){
                if ((tahun % 400) != 0)
                System.out.print("tahun kabisat");
                else 
                    System.out.println(" bukan tahun kabisat");
            } else
                System.out.println(" 200tahun kabisat");
        } else 
            System.out.println(" bukan tahun kabisat");
        
    }
}