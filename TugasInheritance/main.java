/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInheritance;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        Buah buah = new Buah();
        
        buah.berasa("Jeruk");
        Jeruk jeruk = new Jeruk();
        jeruk.Rasa();
        
        buah.berasa("Semangka");
        Semangka semangka = new Semangka();
        semangka.Rasa();
        
        buah.berasa("Kesemek");
        Kesemek kesemek = new Kesemek();
        kesemek.Rasa();
        
        buah.berasa("Pare");
        Pare pare = new Pare();
        pare.Rasa();
    }
}
