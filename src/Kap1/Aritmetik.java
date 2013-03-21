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
public class Aritmetik {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
       double x, y, sum, diff, kvot, produkt;
        
       //inmatning
        System.out.print("Skriv in tal ett: ");
        x = sc.nextDouble();
        System.out.print("Skriv in ett tal till: ");
        y = sc.nextDouble();
        
        //beräkning
        sum = x + y;
        diff = x- y;
        kvot = x / y;
        produkt = x * y;
        
        //utskrift
        System.out.println("Summan är " + sum);
        System.out.println("Differensen är " + diff);
        System.out.println("Kvoten är: " + kvot);
        System.out.println("produkt är: " + produkt);
        
    
    
    }//end main 
    
    
    
    
}//end class
