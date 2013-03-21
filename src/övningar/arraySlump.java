/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package övningar;

/**
 *
 * @author Marcus Heggem
 */
public class arraySlump {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        
        System.out.println("Arrayens element slumpas och skrivs ut:");
            
        for (int i = 0; i < a.length; i++) {
            if(i%10==0){
                System.out.println("");
            }
            a[i] = (int)(1000 * Math.random());
            System.out.print(a[i] + "\t");
        }
    }

}
