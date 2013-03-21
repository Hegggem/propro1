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
public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c, fortsatt;
        
        do {
        System.out.print("Väl mellan alternativ (A/B): ");
        c = sc.next().charAt(0);
        System.out.println("Du har valt:" + c );
        
        
            
        
        
       if (c == 'A'){
           System.out.println("Grattis, du har inte vunnit ett skit");  
       }
       
       else {
           System.out.println("sucks to be you");
       }
           System.out.println("Vill du testa på att vinna 400 miljarder svenska kronor igen? (J/N)");
           fortsatt = sc.next().charAt(0);
       } while ( fortsatt == 'j' || fortsatt =='J');
        
        
    }//end main
    
}//end class
