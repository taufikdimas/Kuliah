    /**
     * Star27
     */
    import java.util.Scanner;

    public class Star27 {

        public static void main(String[] args) {
            Scanner sc27 = new Scanner(System.in);

            System.out.print("Masukkan Nilai N = ");
            int N = sc27.nextInt();

            for(int i=1; i<=N; i--){
                System.out.print("*");
            }
        }
    }