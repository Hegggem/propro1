/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap1_2ovn;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Skivor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat ("0.##");
        int skivor;
        double skivpris;
        String formateratTal;
        
        
        System.out.println("HEJ OCH VÄLKOMMEN, HOS MIG KÖPER DU SKIVOR FÖR 9.90 KR/ST !!!!!");
        
        System.out.println("Hur många skivor vill du köpa ");
        skivor = sc.nextInt();
        skivpris= skivor * 9.90;
        formateratTal = d.format(skivpris);
        
        if (skivor>=100){
            System.out.println("Du får 15% rabatt");
           skivpris = skivpris*0.85;
           formateratTal = d.format(skivpris);
           System.out.println("Ditt skivpris blir" + skivpris +"kr för ditt bög köp");
        
        }else if(skivor>=50){
            System.out.println("du får 10% rabatt");
            formateratTal = d.format(skivpris);
           skivpris = skivpris*0.90;
           System.out.println("Ditt skivpris blir" + skivpris +"kr för ditt bög köp");
        
        }else if(skivor>=10){
            System.out.println("du får 5% rabatt");
            formateratTal = d.format(skivpris);
          skivpris = skivpris*0.95;
          System.out.println("Ditt skivpris blir" + skivpris +"kr för ditt bög köp");
        
        }else {
            System.out.println("LEAVE IT!");
            System.out.println("Ditt skivpris blir" + skivpris +"kr för ditt bög köp");
        }
        
        
        
      
    
        
        
        
    }

}
