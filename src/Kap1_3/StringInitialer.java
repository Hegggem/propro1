/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class StringInitialer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Förnamn;
        String Efternamn;
        
        System.out.println("Vad är ditt förnamn?");
        Förnamn = sc.next();
        System.out.println("Skriv in ditt efternamn");
        Efternamn = sc.next();
        Stringbuffer sb = new Stringbuilder();
        
        System.out.println("Dina initialer är " + Förnamn.charAt(0) +"."+ Efternamn.charAt(0) );
        
        String helaNamnet = "Marcus Heggem";
        
        System.out.print(helaNamnet.charAt(0)+".");
        
        for (int i = 0; i < helaNamnet.length(); i++) {
            if (helaNamnet.charAt(i) == ' ') {
                System.out.println(helaNamnet.charAt(i + 1));
                
            }
        }
    
    
    
    
    }

    
    
}
