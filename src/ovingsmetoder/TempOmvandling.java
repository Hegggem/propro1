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
public class TempOmvandling {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        
        System.out.println("Vilken temperatur är det i fahrenheit: ");
        x = sc.nextInt();
        
        
        supporten temp = new supporten();
        
        
        
       double svar = temp.tempomvandling(x);
        
        System.out.println( x +" Fahrenheit i Celsius är: " + svar);
        
    }

}
