/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ovingsmetoder;

/**
 *
 * @author Marcus Heggem
 */
public class Supporten {
    
    public double tempomvandling(int tal) {
        
        double svar = (tal-32)/1.8;
               
        return svar;
        
    }//end tempomvandling
    
    public double minst(double tal1, double tal2) {
        
        
        double minstvärde = tal1;
        
        if(tal2 < tal1){
            minstvärde = tal2;
        }
        
        return minstvärde;
        
    }//end minst
    
    public double ohmgrej(double tal1, double tal2) {
        
        double svar = tal1 * tal2;
        
        return svar;
        
    }// end ohmgrej
    
    public double cirkelarea(double tal1) {
        double pi = 3.14;
                
        double area = pi * tal1 * tal1;
        
        return area;
    
    }//end cirkelgrej
    
    public double cirkelomkrets(double tal1) {
        double pi = 3.14;
        
        double omkrets = 2 * pi * tal1;
        
        return omkrets;
    }
    
    public void soltimmarna(String stad, int soltimmar) {
        
        System.out.println(""+stad);
        for (int i = 0; i < soltimmar; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }//end soltimmar
    
    public boolean langdhopp(double tal1, double tal2) {
        boolean langdhopp;
        if(tal1<=2 && tal2>7.92){
          langdhopp = true;
      }
        else {
          langdhopp = false;
      }
        return langdhopp;
        
        
            
        
    }

}
