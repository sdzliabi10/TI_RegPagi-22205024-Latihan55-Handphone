/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan55_Handphone;


/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi menampilkan jenis-jenis handphone
 */
public class PBO_22205024_Latihan55_Handphone {
    public static void main(String[] args){
    Android android = new Android("Samsung","Android","Grand",3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android KeyStore : "+android.getKeyStore());
        System.out.println("");
        
        BlackBerry bb = new BlackBerry("BlackB","RIM","Curve",2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone nokia = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        nokia.setWpkeyStore("UUUQIJWORJ");
        nokia.displayProduct();
        System.out.println("Wp Key Store : "+nokia.getWpKeyStore()); 
      
    }
}
