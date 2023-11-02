/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceBangundatar;

/**
 *
 * @author WINDOWS 10
 */
public class Persegipanjang extends BangunDatar{
    float panjang;
    float lebar;
     
     @Override
   float luas(){
       float luas = panjang*lebar;
       System.out.println("Luas Persegi Panjang = " + luas);
       return luas;
   }
   @Override
   float keliling(){
       float keliling = 2*panjang + lebar;
       System.out.println("Kelliling Persegi Panjang = " + keliling);
       return keliling;
   }
}
