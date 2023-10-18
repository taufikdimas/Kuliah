public class While27 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000000) {
            if (i % 2 == 0 ){
                System.out.println("Angka " + i + " adalah bilangan genap");
            }else {
                System.out.println("Angka " + i + " adalah bilangan ganjil");
            }
            i++;
        }
    }
}
