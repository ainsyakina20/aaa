/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2.modul3;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author LABFIK
 */
public class TestNilai {
    
    public static void main(String[] args){
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int banyakData = input.nextInt();
        int nilai[] = new int[banyakData];
        ArrayList nilaiBaru = new ArrayList();
        System.out.print("Masukkan Nilai : ");
        hitung.inputNilai(nilai);
        System.out.print("Daftar Nilai : ");
        hitung.cetakNilai(nilai);
        System.out.println("Rata Nilai "+hitung.rataNilai(banyakData));
        System.out.print("Masukkan Nilai Baru :");
        hitung.inputNilaiBaru(banyakData);
        System.out.print(banyakData);
        System.out.print("Datar Nilai Baru : ");
        hitung.cetakNilaiBaru();
    }
    
}
