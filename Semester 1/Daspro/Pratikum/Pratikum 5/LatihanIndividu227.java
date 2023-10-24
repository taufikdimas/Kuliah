import java.util.Scanner;

/**
 * LatihanIndividu227
 */
public class LatihanIndividu227 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Username = "Taufik27";
        String Password = "123456";

        System.out.print("Username : ");
        String username = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Username atau Password Anda Salah");
        }
    }
}