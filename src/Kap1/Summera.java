/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author marheg
 */
public class Summera {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x, y, summa;
        
System.out.print("skriv ett tal ");
        x = sc.nextInt();
        
System.out.print("Skriv ett tal till ");
        y = sc.nextInt();
        
        summa = x + y;
        
        System.out.println("Summan är; " + summa);
        
        
        
        
        
    }//end main
}//end class
