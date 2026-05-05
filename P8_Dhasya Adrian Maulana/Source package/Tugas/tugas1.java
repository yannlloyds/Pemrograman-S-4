import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kehadiran = -1;
        // statement 1 pilih menu
        System.out.println("===MENU===");
        System.out.println("1. input kehadiran");
        System.out.println("2. cetak kehadiran");
        System.out.print("pilih menu: ");
        int menu = input.nextInt();
        switch (menu) {
            // case 1 untuk input kehadiran
            case 1:
                System.out.print("input kehadiran: ");
                kehadiran = input.nextInt();
                // while loop sampai kehadiran > 70
                while (kehadiran <= 70) {
                    System.out.println("Kehadiran harus diatas 70");
                    System.out.print("input kehadiran lagi: ");
                    kehadiran = input.nextInt();
                }
                System.out.println("kehadiran berhasil diinput");
                break;
            // case 2 cetak kehadiran
            case 2:
                if (kehadiran == -1) {
                    System.out.println("tidak ada data kehadiran");
                } else {
                    System.out.println("===DATA KEHADIRAN===");
                    System.out.println("Kehadiran: " + kehadiran);
                    if (kehadiran > 70) {
                        System.out.println("Status: Lulus");
                    } else {
                        System.out.println("Status: Tidak Lulus");
                    }
                }
                break;
            default:
                System.out.println("pilihan tidak ada");
        }
        input.close();
    }
}