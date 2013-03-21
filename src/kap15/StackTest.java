/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap15;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Marcus Heggem
 */
public class StackTest {
    public static void main(String[] args) {
        
        Stack<String> minStack = new Stack<>(); 
        Scanner sc = new Scanner(System.in);
        
        int val;
        boolean fortsatt = true;
        String namn;
        while (fortsatt) {
            
            System.out.println("Välj ett alternativ");
            
            System.out.println("1. Lägg till en tallrik");
            System.out.println("2. kolla vems som ligger högst upp");
            System.out.println("3. ta bort en tallrik");
            System.out.println("0. Avsluta");
        
        
                
            val = sc.nextInt();
            
            switch (val) {
                case 1:
                    System.out.println("Vems tallrik vill du lägga till i stacken?");
                    namn = sc.next();
                    minStack.push(namn);
                    System.out.println(minStack);
                    break;
                case 2:
                    System.out.println("Talriken som ligger höst upp är " + minStack.peek()+ " tallrik");
                    break;
                case 3:
                    System.out.println("Du tog bort " + minStack.pop());
                    break;
                default:
                    throw new AssertionError();
            
            }
        
        
        }
        
        
    }

}
