
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap1_2;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Betyg {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int poang;
        
        
        System.out.println("Skriv in ditt poang: ");
        poang = sc.nextInt();
       
        
        if (poang >= 90) {
            System.out.println("MVG");
        }
        
        else if (poang >= 70){
            System.out.println("VG");
        }
        else if (poang >= 50){
            System.out.println("G");
        }
        else {
            System.out.println("IG");
        }
        
        
    }//end main

}//end class
