/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author marheg
 */
public class Elit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char c;
        
        System.out.println("Väl mellan alternatic A och B: ");
        c = sc.next().charAt(0);
        System.out.println("Du skrev tecknet: " + c );
        
        if (c == A){
            System.out.println("Du är eliiiiiiiiiiiiiit !!!!!");
        }
        
        else{
            System.out.println("Du är noob fan .....");
        }
        
            
        
    }//end class
    
}//end main
