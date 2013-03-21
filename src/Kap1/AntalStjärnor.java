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
public class AntalStjärnor {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        //inmatning
        System.out.println("Ange antal stjärnor");
        int AntalVarv = sc.nextInt();
        
        while ( i < AntalVarv){
            System.out.print("*");
            i++;
        }
        
        
    }//end main
        
    }//end class
