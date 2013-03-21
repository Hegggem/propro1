/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap1_2ovn;

import java.util.Scanner;



/**
 *
 * @author Marcus Heggem
 */
public class NamnLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        
        System.out.println("Vad är ditt namn?: ");
        String namn = sc.nextLine();
        
        System.out.println("Hur många gånger ska de skrivas?");
        n = sc.nextInt();
        
        
        
                
             for(int i = 0; i < n;i++){
                 System.out.println("" + namn);
                
                 
             }   
    }

}
