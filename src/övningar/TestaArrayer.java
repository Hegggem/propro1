/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package övningar;

import java.util.Arrays;

/**
 *
 * @author Marcus Heggem
 */
public class TestaArrayer {
    public static void main(String[] args) {
        
        int []a = {1, 2, 3};
        int[]b = {1, 2, 3};
        
        boolean koll = Arrays.equals(a, b);
        
        if (koll == true) {
            System.out.println("Alike");
        }else{
            System.out.println("Olka");
        }
    }//end main

}//end class
