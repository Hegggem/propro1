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
public class Feber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       double temp;
       
        System.out.println("Vilken temperatur har du: ");
        temp = (double)sc.nextDouble();
        
        if (temp > 37.5){
            System.out.println("Du har feber !!!");}
        
        else {
            System.out.println("Du är frisk !");
        }
        
            
        }//end main
        
        
    }//end class
    
    
    



