import java.util.Scanner;
public class Square27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc27.nextInt();
 
        for (int iOuter=1; iOuter<=N; iOuter++){
            for(int i=0; i<=N; i++){
            System.out.print("*");
        }
        System.out.println();
        }
        
    }
}