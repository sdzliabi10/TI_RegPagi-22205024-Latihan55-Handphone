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
public class BlackBerry extends Handphone{
   private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getPinBB(){
        return pinBB;
    }
    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }
   
  
    
}
