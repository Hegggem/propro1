/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ovingsmetoder;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Soltimmar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Supporten cartman = new Supporten();
        String stad;
        int soltimmar;
        char fortsatt;
        
        do {
            System.out.print("Ange staden: ");
            stad = sc.next();
            System.out.print("Ange antalet soltimmar i staden: ");
            soltimmar = sc.nextInt();
            cartman.soltimmarna(stad, soltimmar);

            System.out.print("Vill du göra en ny beräkning J/N ?");
            fortsatt = sc.next().charAt(0);            
        } while (fortsatt == 'j' || fortsatt == 'J');

}//end class
