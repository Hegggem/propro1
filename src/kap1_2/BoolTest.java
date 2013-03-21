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
public class BoolTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int alder;
        boolean myndig;
        
        System.out.print("Skriv in din alder: ");
        
        alder = sc.nextInt();
        myndig= alder > 17;
        
        if (myndig) System.out.println("Du är myndig");
        else System.out.println("du är inte myndig");
        
        
        
        
    }//end main

}//end class
