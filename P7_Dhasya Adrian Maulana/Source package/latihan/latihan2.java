import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan pilihan (a/b): ");
        String pilihan = input.next();
        switch (pilihan) {
            case "a":
                System.out.println("dipilih: ayam");
                break;
            case "b":
                System.out.println("dipilih: beruang");
                break;
            default:
                System.out.println("tidak ada hewan yang dipilih");
        }
    }
}