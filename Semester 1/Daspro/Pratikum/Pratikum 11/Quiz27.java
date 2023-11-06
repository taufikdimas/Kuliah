import java.util.Scanner;
import java.util.Random;

public class Quiz27 {
    public static void main(String[] args) {
        Scanner sc27= new Scanner(System.in);
        Random random = new Random();

        char menu ='y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10):");
                int answer = sc27.nextInt();
                sc27.nextLine();
                success = (answer == number);
            }while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = sc27.nextLine().charAt(0);
        }while (menu == 'Y' || menu == 'y');
    }
}
