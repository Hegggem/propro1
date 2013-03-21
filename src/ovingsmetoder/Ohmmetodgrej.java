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
public class Ohmmetodgrej {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    double x, y;
    
        System.out.println("Skriv in x värdet");
        x = sc.nextDouble();
        
        System.out.println("Skriv in y värdet");
        y = sc.nextDouble();
        
        Supporten cartman = new Supporten();
        
        double svar = cartman.ohmgrej(x, y);
        
        System.out.println("Spänningen är " + svar);
    
    }
}
