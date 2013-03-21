/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provövning;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Doloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Förnamn, Efternamn, Helanamn;
        char fortsatt;
        
        do {
            System.out.println("Skriv in ditt förnamn");
            Förnamn = sc.next();
            System.out.println("Skriv in ditt efternamn");
            Efternamn = sc.next();
            
            Helanamn = Förnamn + Efternamn;
            
            System.out.println("Ditt fulla namn är "+ Helanamn);
            System.out.println("Vill du göra det här igen? J/N");
            fortsatt = sc.next().charAt(0);
        } while (fortsatt == 'j' || fortsatt == 'J');
        
        System.out.println("Hörs");
    }

}
