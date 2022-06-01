/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2.modul3;
import java.util.*;
/**
 *
 * @author LABFIK
 */
public class HitungRata {
    private double total = 0;
    private ArrayList nilaiBaru = new ArrayList();
    Scanner input = new Scanner(System.in);
    
    public void inputNilai(int nilai[]){
        
        int i = 0;
        while(i<nilai.length){
            nilai[i] = input.nextInt();
            total += nilai[i];
            i++;
        }
        
//        for (int i=0; i<nilai.length; i++){
//            nilai[i] = input.nextInt();
//            total += nilai[i];
//        }
    }
    
    public double rataNilai(int Ndata){
        return total/((double)Ndata);
    }
    
    public void cetakNilai(int nilai[]){
        for (int angka: nilai){
            System.out.print(angka + "\t");
        }
        System.out.println();
    }
    
    public void inputNilaiBaru(int jumlah){
        while (jumlah > 0){
            nilaiBaru.add(input.nextInt());
            jumlah--;
        }
    }
    
    public void cetakNilaiBaru(){
        ListIterator i = nilaiBaru.listIterator(0);
        while(i.hasNext()){
            Object data = i.next();
            if (data==null){
                System.out.println("null");
            }else{
                System.out.println(data.toString());
            }
        }
    }
    
}
