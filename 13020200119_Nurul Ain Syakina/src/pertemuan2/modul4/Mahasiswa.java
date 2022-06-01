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
public class Mahasiswa extends Orang{
    private String stb;

    public String getStb() {
        return stb;
    }

    public void setStb(String stb) {
        this.stb = stb;
    }
    
    public Mahasiswa(){
        super();
        this.stb="13020200119";
    }
    
    public Mahasiswa(String stb, String nama){
        this.nama=nama;
        this.stb=stb;
    }
    
    Orang org = new Orang();
    
    
    @Override
    public void info(){
        System.out.println("13020200119");
        System.out.println("Ain");
    }
}
