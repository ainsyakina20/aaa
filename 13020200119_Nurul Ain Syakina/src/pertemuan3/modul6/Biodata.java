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
public class Biodata <T1, T2>{
    private T1 id;
    private T2 nama;
    public Biodata(T1 id, T2 nama){
        this.id = id;
        this.nama = nama;
    }

    public T1 getId() {
        return id;
    }

    public void setId(T1 id) {
        this.id = id;
    }

    public T2 getNama() {
        return nama;
    }

    public void setNama(T2 nama) {
        this.nama = nama;
    }
    
    public <T> void info(T ket) {  //method generic
        System.out.println(ket);
    }
    
    public class Alamat{  //inner class
        private T1 nomor;
        private T2 jalan;
        public Alamat(T1 nomor, T2 jalan){
            this.nomor = nomor;
            this.jalan = jalan;
        }

        public T1 getNomor() {
            return nomor;
        }

        public void setNomor(T1 nomor) {
            this.nomor = nomor;
        }

        public T2 getJalan() {
            return jalan;
        }

        public void setJalan(T2 jalan) {
            this.jalan = jalan;
        }
        
    }
}
