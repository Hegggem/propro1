/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_3;

/**
 *
 * @author Marcus Heggem
 */
public class StringStad {
    public static void main(String[] args) {
        
        String stad = "Tjeckoslovakien";
        
        System.out.println("Finns det någon huvudstad i order Tjeckoslovakien? ");
        
        System.out.println("Ja, " + stad.substring(5, 9));
    }

}
