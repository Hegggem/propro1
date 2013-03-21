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
public class cirkelmetod {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi, radie;
        pi = 3.14;
        
        System.out.println("ange radien");
        radie = sc.nextDouble();
        
        Supporten cartman = new Supporten();
        
        double area = cartman.cirkelarea(radie);
        double omkrets = cartman.cirkelomkrets(radie);
        
        System.out.println("cirkelns area är " + area);
        System.out.println("Cirkelns omkrets är " + omkrets);

}
