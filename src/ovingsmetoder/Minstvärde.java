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
public class Minstvärde {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        
        System.out.println("Ange x-värdet");
        x = sc.nextDouble();
        
        System.out.println("Ange y-värdet");
        y = sc.nextDouble();
        
        supporten minsta = new supporten();
        
        double minstvärde = minsta.minst(x, y);
        
        
        System.out.println("Det minsta värdet är " + minstvärde);
        
      
        
    }
}
