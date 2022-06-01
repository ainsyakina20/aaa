/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2.modul4;

/**
 *
 * @author LABFIK
 */
public class Utama {
    
    public static void main(String[] args){
        Orang orang = new Orang();
        orang.nama = "Nurul Ain Syakina";
        System.out.println("Stb : " +orang.nama);
        
         Mahasiswa mhs1 = new Mahasiswa();
         Mahasiswa mhs2 = new Mahasiswa("13020200119","Ain");
         
         mhs1.info();
         orang.info();
    }
    
   
    

 
}
