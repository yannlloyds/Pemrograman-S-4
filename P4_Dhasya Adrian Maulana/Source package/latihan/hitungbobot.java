import java.util.Scanner;
public class hitungbobot {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Float kehadiran;
        Float realisasi;
        Float tugas;
        Float tugas_uts;
        Float tugas_uas;

        System.out.print("input kehadiran : ");
        kehadiran = input.nextFloat();

        System.out.print("input realisasi : ");
        realisasi = input.nextFloat();

        System.out.print("input tugas : ");
        tugas = input.nextFloat();

        System.out.print("input tugas uts : ");
        tugas_uts = input.nextFloat();

        System.out.print("input tugas uas : ");
        tugas_uas = input.nextFloat();

        float bobot_kehadiran = (kehadiran / realisasi) * 10;
        float bobot_tugas = tugas;
        float bobot_uts = tugas_uts;
        float bobot_uas = tugas_uas;


        float total = bobot_kehadiran + bobot_tugas + bobot_uts + bobot_uas;
        System.out.println("(total nilai: )" + total);
        
        

        


        
    }

}