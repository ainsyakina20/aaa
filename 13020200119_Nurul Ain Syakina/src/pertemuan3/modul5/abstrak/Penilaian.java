/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.modul5.abstrak;
import java.io.IOException;
/**
 *
 * @author LABFIK
 */
public abstract class Penilaian {
    public int acc1, acc2, acc3, acc4, mid, uas;
    public abstract void inputNilaiAcc();
    public abstract void inputNilaiUjian();

    /**
     *
     * @throws IOException
     */
    public void tampilNilai() throws IOException{
        System.out.println("Nilai Acc1 : " + acc1);
        System.out.println("Nilai Acc2 : " + acc2);
        System.out.println("Nilai Acc3 : " + acc3);
        System.out.println("Nilai Acc4 : " + acc4);
        System.out.println("Nilai MID : " + mid);
        System.out.println("Nilai Final : " + uas);
    }
}
