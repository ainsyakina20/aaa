/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1.mod1;
import java.util.Scanner;
/**
 *
 * @author LABFIK
 */
public class Hitung {
 
    
    public Hitung () {
        nama = "Nurul Ain Syakina";
        stb = "13020200119";
    }
    String nama, stb;
       
    public float tambah(int nilai1, int nilai2) {
        return(nilai1+nilai2);
    }
    public float selisih(int nilai1, int nilai2) {
        return(nilai1-nilai2);
    }
    public float kali(int nilai1, int nilai2) {
        return(nilai1*nilai2);
    }
    public float bagi(int nilai1, int nilai2) {
        return(nilai1/nilai2);
    }
    public void tampilNama(){
        System.out.println("Nama : " +nama);
        System.out.println("Stambuk : " +stb);
    }
    
    public static void main(String[] args) {
        
        Hitung htg = new Hitung();
        int nilai1, nilai2;
        String pilihan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = sc.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = sc.nextInt();
        System.out.print("Masukkan pilihan : ");
        pilihan = sc.next();
        
        if (pilihan.equals("tambah")) {
            System.out.println(nilai1 + "+" +nilai2+ "=" +htg.tambah(nilai1, nilai2));
        } else if (pilihan.equals("selisih")) {
            System.out.println(nilai1 + "-" +nilai2+ "=" +htg.selisih(nilai1, nilai2));
        } else if (pilihan.equals("kali")) {
            System.out.println(nilai1 + "*" +nilai2+ "=" +htg.kali(nilai1, nilai2));
        } else if (pilihan.equals("bagi")) {
            System.out.println(nilai1 + "+" +nilai2+ "=" +htg.bagi(nilai1, nilai2));
        } else {
            System.out.println("Tidak ada dalam pilihan");
        }
        
        System.out.println("Tampil Nama");
        htg.tampilNama();
          
    }
}
