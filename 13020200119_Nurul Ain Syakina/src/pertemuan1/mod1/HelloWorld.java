/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1.mod1;

/**
 *
 * @author LABFIK
 */
public class HelloWorld {
    String nama;
    String stb;
    
    public HelloWorld(String nama, String stb){
           this.nama=nama;
           this.stb=stb;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        System.out.println("Ain/13020200119");
        System.out.println("Ini Pemrograman Java");
        
        HelloWorld hello = new HelloWorld("Ain","13020200119");
        System.out.println(hello.nama);
        System.out.println(hello.stb);
           
    }


   
}
