/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap1_3;

/**
 *
 * @author Marcus Heggem
 */
public class StringEquals {
    public static void main(String[] args) {
        
          String namn = "Marcus";
          String namn2 = "Marcus";
          
          boolean test = namn.equals(namn2);
          
          if (namn.equals(namn2)) {
              System.out.println("Grattis...");
        }else  {
              System.out.println("dåligt");
          }
    }

}
