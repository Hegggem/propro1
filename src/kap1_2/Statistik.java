/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap1_2;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Statistik {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
        double tal;
        double summa = 0;
        int Antalvarv;
        double medel;
        double max = 0;
        
        System.out.println("Ange antalet varv!");
        Antalvarv = sc.nextInt();
        
        for (int i = 0; i < Antalvarv; i++) 
        {
            
        
            System.out.println("ange ett tal: ");
            tal = sc.nextDouble();
            summa = tal + summa;
            
            if (tal > max) {
                max = tal;
            }
        
        
    }
        
        
        System.out.println("Summan är " + summa);
        
        medel = summa / Antalvarv;
        System.out.println("Medelvärdet är "+ medel);
        System.out.println("maxvärdet är "+ max);
}
