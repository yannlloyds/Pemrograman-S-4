import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class latiha_narray {
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
    }
}