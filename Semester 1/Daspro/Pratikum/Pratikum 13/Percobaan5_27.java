public class Percobaan5_27 {
    public static void main(String[] args) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");
        printData(new String[] { "Hello", "Rek", "Polinema" }, 1, 2, 3);
    }

    static void printData(String[] strings, int... numbers) {
        for (String str : strings) {
            System.out.println(str);
        }
        for (int num : numbers) {
            System.out.println(num);
        }

    }

    static void Tampil(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " + a.length);

        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

}
