import java.util.Scanner;

/**
 * forVar327
 */
public class forVar327 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int bil, n;
        boolean berhenti = false;
        for (n = 0; !berhenti; n++){
            System.out.print("Masukkan bilangan: ");
            bil = sc27.nextInt();
            System.out.println("Bilangan yang anda masukkan : " + bil);
            if (bil < n){
                berhenti = true;
            }
        }
        System.out.println("Program berakhir");
    }
}