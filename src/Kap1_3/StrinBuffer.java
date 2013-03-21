/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class StrinBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        StringBuilder hem = new StringBuilder("??????");
        
        System.out.println(hem.toString());
        
        for (int i = 0; i < hem.length(); i++) {
        System.out.println("Skriv in en bokstav: ");
        char tecken = sc.next().charAt(0);
        hem.setCharAt(i, tecken);
        System.out.println(hem.toString());
        }
        
        
    }

}
