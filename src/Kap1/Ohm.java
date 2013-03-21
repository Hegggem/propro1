/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Ohm {
   
    //deklaration
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double u, r, i;
        char fortsatt;
        
        do {
        //inmatning
        System.out.println("Skriv ut strömmen: ");
        r = sc.nextDouble();
        System.out.println("Skriv ut resistansen: ");
        i = sc.nextDouble();
        
        //uträkning
        u = r * i;
        
        //utskrift
        System.out.println("Spänningen är " + u);
        
            System.out.println("Vill du göra om göra rätt bögjävel ? (J/N)");
            fortsatt = sc.next().charAt(0);
        
        }while (fortsatt == 'j' || fortsatt == 'J');
        
        
    }

}
