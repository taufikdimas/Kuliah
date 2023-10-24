import java.util.Scanner;

public class ForVar227 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int bil;
        boolean berhenti = false;
        
        for (; !berhenti; ) {
            System.out.print("Masukkan bilangan: ");
            bil = sc27.nextInt();
            System.out.println("Bilangan yang anda masukkan: " + bil);
            if (bil == 0) {
                berhenti = true;
            }
        }
        System.out.println("Program berakhir" );
    }
}
