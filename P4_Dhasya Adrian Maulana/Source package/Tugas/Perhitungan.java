public class Perhitungan {
    public static void main(String[] args) {
        double makan = 20000;
        double transport = 10000;
        double belanja = 50000;
        double total = makan + transport + belanja;

        double Makan = (makan / total) * 100;
        double Transport = (transport / total) *100;
        double Belanja = (belanja / total) * 100;
        System.out.println("total: " + total);
        System.out.println("persentase: ");
        System.out.println("1. makan: " + Makan + "%");
        System.out.println("2. transport: " + Transport + "%");
        System.out.println("3. belanja: " + Belanja + "%");

    }
}