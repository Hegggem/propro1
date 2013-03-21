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
public class Alder {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int alder;
        
        
        //inmatning
        System.out.print("Hur gammal är du: ");
        alder = sc.nextInt();
        
                
        //berääkning
        //alder = alder + 1
        if (alder > 17) {
        System.out.println("du är myndig");
    }
        
        else {
            System.out.println("D");
                    
}
                
        //utskrift
                
   
                
                }//end main
    
}//end class
