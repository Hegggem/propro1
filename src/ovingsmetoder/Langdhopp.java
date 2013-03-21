/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ovingsmetoder;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Langdhopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double langd, vind;
        char fortsatt;
        
        do {
        System.out.println("Ange vindhastighet: ");
        vind = sc.nextDouble();
        System.out.println("ange längden på hoppet: ");
        langd = sc.nextDouble();
        
        Supporten cartman = new Supporten();
        
        boolean langdhopp = cartman.langdhopp(vind, langd);
        
            if (langdhopp) {
                System.out.println("Grattis, du är dench");
            }
            else{
                System.out.println("Leave it.....");
            }
    
        
        System.out.println("Vill du göra det här roliga hoppet en gång till ? (J/N)");
            fortsatt = sc.next().charAt(0);
        }while (fortsatt == 'j' || fortsatt == 'J');
        
    }

}
