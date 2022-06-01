/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.modul5;
import java.util.Scanner;
import pertemuan3.modul5.abstrak.Penilaian;
import pertemuan3.modul5.interfaces.Praktikan;
import pertemuan3.modul5.interfaces.Praktikum;
/**
 *
 * @author LABFIK
 */
public class Utama extends Penilaian implements Praktikan, Praktikum {
    String nama, stb, praktikum;
    Scanner sc;
    
    public Utama(){
        sc = new Scanner(System.in);
    }
    
    @Override
    public void inputNilaiAcc(){
        System.out.println("Masukkan Nilai Acc1 : ");
        acc1 = sc.nextInt();
        System.out.println("Masukkan Nilai Acc2 : ");
        acc2 = sc.nextInt();
        System.out.println("Masukkan Nilai Acc3 : ");
        acc3 = sc.nextInt();
        System.out.println("Masukkan Nilai Acc4 : ");
        acc4 = sc.nextInt();
        
    } 
    
    @Override
    public void inputNilaiUjian() {
        System.out.println("Masukkan Nilai MID : ");
        mid = sc.nextInt();
        System.out.println("Masukkan Nilai UAS : ");
        uas = sc.nextInt();
    }
    
    @Override
    public void InputNamaStb(){
        System.out.println("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.println("Masukkan Stb : ");
        stb = sc.nextLine();
    }
    
    @Override
    public void InputPraktikum(){
        System.out.println("Masukkan Nilai Tugas 1 : ");
        float tugas1 = sc.nextInt();
        System.out.println("Masukkan Nilai Tugas 2 : ");
        float tugas2 = sc.nextInt();
    }
    
    @Override
    public float nilaiTugas1(){
        return (acc1 + acc2)/2;
    }
    
    @Override
    public float nilaiTugas2(){
        return (acc3 + acc4)/2;
    }
    
    @Override
    public float nilaiAkhir(float tugas1, float tugas2, float mid, float uas){
        return (float) (((tugas1 + tugas2)/2 * 0.3) + (mid*0.3)+(uas*0.4));
    }
    
    public static void main(String[] args) {
        
        Utama program = new Utama();
        
        program.InputNamaStb();
        program.InputPraktikum();
        program.inputNilaiAcc();
        program.inputNilaiUjian();
        
      
        float tugas1 = program.nilaiTugas1();
        float tugas2 = program.nilaiTugas2();
        
        float na = program.nilaiAkhir(tugas1, tugas2, program.mid, program.uas);
        System.out.println("Nilai Akhir : " + na);
           
    }
}
