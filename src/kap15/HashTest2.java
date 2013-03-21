/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap15;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class HashTest2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String,String> ht = new HashMap<>();
        
        char svar;
        boolean fortsatt = true;
        int rattsvar = 0;
        
        while(fortsatt){
        
        System.out.println("DINA VAL");
        System.out.println("1. Lägg till hashtabellen");
        System.out.println("2. Sök huvudstaden");
        System.out.println("3. visa hashtabellens innehåll");
        System.out.println("4. Geografiförhör");
        System.out.println("0. avsluta");
        
        svar = sc.next().charAt(0);
        switch (svar) {
            case '1':
                ht.put("Sverige", "Stockholm");
                ht.put("Danmark","Köpenhamn");
                ht.put("Finland", "Helsingfors");
                ht.put("Norge","Oslo");
                System.out.println("klartarrtrt");
                break;
            case '2':
                System.out.println("Vilket lands huvudstad vill du checka ?");
                String land = sc.next();
                System.out.println("LAndets huvudstad är " + ht.get(land));            
                break;
            case '3':
                for (String nyckel : ht.keySet()) {
                    System.out.print(nyckel + ":");
                    System.out.println(ht.get(nyckel));
                }
                break;
            case '4':
                for (String nyckel : ht.keySet()) {
                    System.out.println("Vad heter huvudstaden i " + nyckel );
                    String svaret = sc.next();
                    if (svaret.equals(ht.get(nyckel))) {
                        System.out.println("GET ON YOUR BIKE ALABA");
                        rattsvar++;
                    }else
                     
        
           }
      
        
        }
    }
}



