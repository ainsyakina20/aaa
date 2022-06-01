/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.modul6;

/**
 *
 * @author LABFIK
 */
public class Utama {
    public static void main(String[] args){
        Biodata<Integer, String> biodata = new Biodata<> (1302020119,"Nurul Ain Syakina");
        Biodata<Integer, String>.Alamat biodataA = new Biodata<Integer, String> (1, "Daya").new Alamat(6, "Hertasning");
        
        System.out.println("Id : " + biodata.getId());
        System.out.println("Nama : " + biodata.getNama());
        System.out.print("Jalan : " + biodataA.getJalan());
        System.out.println(" No." + biodataA.getNomor());
       
        biodata.<String>info("Status Mahasiswa");
    }
}
