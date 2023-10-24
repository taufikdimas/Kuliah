import java.util.Scanner;

public class PemilihanPercobaan327 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama : ");
        angka1 = input27.nextDouble();
        System.out.print("Masukkan angka kedua   : ");
        angka2 = input27.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /):  ");
        operator = input27.next().charAt(0);

        switch (operator) {
           case '+':
               hasil = angka1 + angka2;
               System.out.print(angka1 + " + " + angka2 + " = " + hasil);
               
           case '-':
               hasil = angka1 - angka2;
               System.out.print(angka1 + " - " + angka2 + " = " + hasil);
               break;
           case '*':
               hasil = angka1 * angka2;
               System.out.print(angka1 + " * " + angka2 + " = " + hasil);
               break;
           case '/':
               hasil = angka1 / angka2;
               System.out.print(angka1 + " / " + angka2 + " = " + hasil);
               break;
           default:
               System.out.print("Operator tidak sesuai");
        }
    }
}