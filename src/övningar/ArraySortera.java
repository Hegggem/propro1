/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package övningar;

/**
 *
 * @author Marcus Heggem
 */
public class ArraySortera {
    public static void main(String[] args) {
        
    
    int n = 10;
    int[]a = new int[n];
    System.out.println ("Här skrivs listan ut");
    
        for (int i = 0; i < n; i++) {
            if (i%1==0) {
                System.out.print("");
                a[i] = (int) (1000 * Math.random());
                System.out.print(a[i] + "\t");
            }
        }
            
            int s;
            for(int i = 0; i < n-1 ; i++){
                for (int j = i+1; j < n; j++) {
                    if (a[i] > a[j]) {
                    s = a[i]; a[i] = a[j]; a[j] = s;
                    }//end if
                }//end for                
            }//end for
            
            System.out.println();
            System.out.print("Efter sortering:");
            for(int i = 0 ; i < n ; i++) {
            if(i%1==0) System.out.println();
            System.out.print(a[i]+"\t");
            }
                
            
        
    }
}
