import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class latihanarray {
    public static void main(String[] args){  
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    String BacaInput = "";
    Byte JmlData = 0;
    Byte DataArray[];
  
    System.out.print("Jumlah data :");
  
    try{
    BacaInput = dataIn.readLine();
    }
    catch( IOException e ){
    System.out.println("Ada kesalahan !");
    }
  
    JmlData = new Byte (BacaInput);
    DataArray = new Byte[JmlData];
    System.out.println();
    for (Byte i = 0;i<JmlData;i++){
    System.out.print("DataArray["+i+"] = ");
  
    try{
    BacaInput = dataIn.readLine();
    }
    catch( IOException e ){
    System.out.println("Ada kesalahan !");
    }
    DataArray[i] = new Byte (BacaInput);
    }
    System.out.println();
    for (Byte i = 0;i<JmlData;i++){
    System.out.println("DataArray["+i+"] = "+DataArray[i]);
    }  
    byte max = DataArray[0];
    byte min = DataArray[0];
    for (byte i = 1; i < JmlData; i++) {
        if (DataArray[i] > max) max = DataArray[i];
        if (DataArray[i] < min) min = DataArray[i];
    }
    System.out.println("Nilai Maksimum : " + max);
    System.out.println("Nilai Minimum  : " + min);
 }
}