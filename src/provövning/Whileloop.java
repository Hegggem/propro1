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
public class Whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int varv;
        int i = 0;
        System.out.println("Hur många varv vill du ska ska utföras?");
        varv = sc.nextInt();
        
        while (i < varv){
            System.out.println("Det här är varv " + i);
            i++;
        }
    }

}
