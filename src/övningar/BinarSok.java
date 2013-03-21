/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package övningar;

import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class BinarSok {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5,6,7,8,9};
        int max, min, t ,pos, mitten;
        min = 0;
        max = a.length - 1;
        
        System.out.println("vilket heltal söker du? ");
        t = sc.nextInt();
        
        pos = -1;
        
        while (min <= max && pos == -1) {
            mitten = (max + min)/2;
            if (t > a[mitten]) {
                min = mitten + 1;
            }else if(t < a[mitten]){
                max = mitten -1;
            }else{
                pos = mitten;
            }
        }//end while
        
        if (pos == -1) {
            System.out.println("Talet hittades inte");            
        }else{
            System.out.println("Talet finns i element nummer " + pos);
        }
    }

}
