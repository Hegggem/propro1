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
public class Starssidled {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        //Oslo
        System.out.print("Ange soltimmar i Oslo: ");
        int antalVarvO = sc.nextInt();
        System.out.print("O: ");
        while ( i < antalVarvO){
            System.out.print("*");
            i++;
        }
        //Stockholm
        
        System.out.println("");
        
        System.out.print("Ange soltimmar i Stockolm: ");
        int antalVarvS = sc.nextInt();
        
        System.out.print("S: ");
        
        i = 0;
        while ( i < antalVarvS){
            System.out.print("*");
            i++;
        }
            
            //Helsingborg
            System.out.println("");
            
        System.out.print("Ange soltimmar i Helsingborg: ");
        int antalVarvH = sc.nextInt();
        
        System.out.print("H: ");
        
        i = 0;
        while ( i < antalVarvH){
            System.out.print("*");
            i++;
        }
        
        
        
        
        
        
        
    }//end main
}//end class
