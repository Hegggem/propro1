/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package provövning;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ord;
        int varv;
        
        System.out.println("Hur många varv ska den upprepa händelsen?");
        varv = sc.nextInt();
        
        for (int i = 0; i < varv; i++) {
            System.out.println("Skriv ett ord");
            ord = sc.next();
            
        }
        System.out.println("Tack för att du slösade tid på det här ;D");
    }

}
