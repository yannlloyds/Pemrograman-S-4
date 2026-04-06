import java.util.Scanner;
public class rekap3hari{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double makan=0;
        double transport=0;
        double belanja=0;
        for (int i = 1; i<= 3; i++){
            System.out.println("\n=== Rekap 3 Hari ===");
            System.out.println("\nHari ke-" +i);
            System.out.print("makan: ");
            makan += input.nextDouble();
            System.out.print("transport: ");
            transport += input.nextDouble();
            System.out.print("belanja: ");
            belanja += input.nextDouble();

        double total = makan + transport + belanja;
        double persenMakan = (makan/total) * 100;
        double persenTransport = (transport/total) * 100;
        double persenBelanja = (belanja/total) * 100;

        System.out.println("\ntotal makan = " + makan);
        System.out.println("total transport =" + transport);
        System.out.println("total belanja = " + belanja);
        System.out.println("\nTotal Keseluruhan = " + total);
        System.out.println("\nPersentase:");
        System.out.println("Makan = " + persenMakan + "%");
        System.out.println("Transport = " + persenTransport + "%");
        System.out.println("Belanja = " + persenBelanja + "%");
    
        }
    }
    
}