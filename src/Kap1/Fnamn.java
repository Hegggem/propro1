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
public class Fnamn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String fnamn;
        int n;
        System.out.println("Skriv ditt namn ");
        fnamn = sc.next();
        System.out.println("Hur många varv? ");
        n = sc.nextInt();
        int i = 0;
        
        while( i < n){
        System.out.println("Du heter " + fnamn);
        i++;
        }
        System.out.println("--- nu är loopen slut ---");
    }//end main
    
}//end class
