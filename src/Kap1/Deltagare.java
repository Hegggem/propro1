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
public class Deltagare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personer;
        
        System.out.println("Hur många personer deltar? ");
        personer = sc.nextInt();
        
        if (personer > 12){
            System.out.println("De är för många !");
        }
        
        else {
            System.out.println("Det är OK !");
        }
    }

}
