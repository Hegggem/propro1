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
public class Iftest {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x, y;
            
            System.out.println("Ange x: ");
            x = sc.nextInt()
            System.out.println("ange y: ");
            y = sc.nextInt()
            
            if(x>0 && y>0){
                System.out.println("båda är positive");
                
            }else if(x>0||y>0){
                System.out.println("ett av dem är positiva");
                
            }else{
        System.out.println("båda är negativa");
    }
            
            
    }//end main

}//end class
