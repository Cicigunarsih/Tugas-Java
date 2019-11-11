/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasdanvolumekubus;

/**
 *
 * @author USER
 */
public class LuasDanVolumeKubus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double P, L, V;
      P = 25;
      L = 6 * P * P;
      V = P * P * P;
      System.out.println("Menghitung Luas dan Volume Kubus");
      System.out.println("Panjang Salah Satu Sisi Kubus :" + P);
      System.out.println("Luas Kubus:" + L);
      System.out.println("Volume Kubus:" + V);
       
    }
    
}
