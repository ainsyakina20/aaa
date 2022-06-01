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
public class Orang {
    protected String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
            
    public Orang(){
        this.nama="Ain";
    }
    
    public Orang(String nama){
        this.nama = nama;
    }
    
    public void info(){
        System.out.println("Nama " +this.nama);
    }
    
}
