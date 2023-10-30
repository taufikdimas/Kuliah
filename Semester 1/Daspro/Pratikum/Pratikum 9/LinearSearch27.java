import java.util.Scanner;
public class LinearSearch27 {

    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        //input jumlah elemen
        System.out.print(" Masukkan jumlah elemen array :");
        int jmlElem = input27.nextInt();
        
        int [] arrayInt = new int[jmlElem];
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-"+(i+1)+":");
            arrayInt[i] = input27.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari :");
        int key = input27.nextInt();

        int indeks =-1;
        for(int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                indeks = i;
                break;
            }
        }
        if (indeks != -1){
            System.out.print("key adadi posisi ke-"+(1+indeks));
        }else {
            System.out.print("key tidak ditemukan");
        }

    }
}
