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
public class Matte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tal1, tal2, sum, diff, kvot, pro;
        char räknesätt, fortsatt;
        
        do {
            
        
        
        System.out.println("Skriv ut ditt första tal värde: ");
        tal1 = sc.nextInt();
        
        
        System.out.println("Skirv ut ditt y värde: ");
        tal2 = sc.nextInt();
        
        System.out.println("Välj räknesätt: ");
        räknesätt = sc.next().charAt(0);
        
        if (räknesätt == '+'){
            System.out.println("Du har valt addition");
            sum = tal1 + tal2;
            System.out.println("Svaret blir" + sum);
        }else if(räknesätt == '-'){
            System.out.println("Du har valt subtraktion");
            diff = tal1 - tal2;
            System.out.println("Svaret är " + diff);
        }else if(räknesätt == '*'){
            System.out.println("Du har valt multiplikation");
            pro = tal1 * tal2;
            System.out.println("Ditt svar blir " + pro);
        }else if (räknesätt =='/'){
            System.out.println("du har valt delning");
            kvot = tal1 / tal2;
            System.out.println("Ditt svar blir " + kvot);
        }
            System.out.println("Vill du göra en ny beräkning?  (J/N)");
            fortsatt = sc.next().charAt(0);
        }while (fortsatt == 'j' || fortsatt == 'J');

    
    }//end main

}//end class
