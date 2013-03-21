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
public class langdhopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double langd, vind;
        
        System.out.println("Ange vindhastighet: ");
        vind = sc.nextDouble();
        System.out.println("ange längden på hoppet: ");
        langd = sc.nextDouble();
        
      if(vind<=2 && langd>7.92){
          System.out.println("Grattis du är dench!");
      }
      else {
          System.out.println("leave it yeah");
      }
    }//end main

}//end class
