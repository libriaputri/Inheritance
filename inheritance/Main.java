/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        
       Zombie zumbi = new Zombie();
        zumbi.name = "Nunu";
        zumbi.hp= 80;
        zumbi.attackpoin=15;
        System.out.println(zumbi.name +" Healt Point = "+zumbi.hp + " Attack poin = "+zumbi.attackpoin);
        zumbi.attack();
        zumbi.walk();
        
        Pocong hantupocong = new Pocong();
        hantupocong.name = "Ocong";
        hantupocong.hp = 70;
        hantupocong.attackpoin = 80;
        System.out.println(hantupocong.name + " Health point = " + hantupocong.hp + " Attack Point = " + hantupocong.attackpoin);
        hantupocong.attack();
        hantupocong.jump();
        
        Burung garuda = new Burung();
        garuda.name = "Buyung";
        garuda.hp = 85;
        garuda.attackpoin = 90;
        System.out.println(hantupocong.name + " Health point = " + hantupocong.hp + " Attack Point = " + hantupocong.attackpoin);
        garuda.attack();
        garuda.fly();
        garuda.jump();
        garuda.walk();
        
    }
 
}
