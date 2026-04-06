import java.util.Scanner;
public class latihan1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        long nim;
        String nama;
        String alamat;
        int usia;
        String orangtua;
        System.out.println("===== BIODATA =====");
        System.out.print("input Nama : ");
        nama = input.nextLine();

        System.out.print("input NIM : ");
        nim = input.nextLong();
        input.nextLine();

        System.out.print("input Alamat : ");
        alamat = input.nextLine();

        System.out.print("input Usia : ");
        usia = input.nextInt();
        input.nextLine();
        System.out.print("input Nama Orang Tua : ");
        orangtua = input.nextLine();

        System.out.println("\n===== DATA BIODATA =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia);
        System.out.println("Nama Orang Tua : " + orangtua);
        input.close();
    }
}