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
public class AntalBil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        
        //TAK
        System.out.println("Ange antal takdelar: ");
        int Takdelar = sc.nextInt();
        while(i<Takdelar){
            System.out.print("_");
            i++;
            
        }
        
        
    
    }//enc main
   

}//end class
