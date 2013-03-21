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
public class Klotet {
    
    //deklaration
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radie, pi, volym;
        pi = 3.14;
        
        //inmatning
        System.out.println("vad är radien? ");
        radie = sc.nextDouble();
        
        //beräkning
        volym = 4*pi*3*radie / 3;
        
        //utskrift
        System.out.println("Volymen är: " + volym);
    
    }//end main

}//end class
