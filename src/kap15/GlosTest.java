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
public class GlosTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> ht = new HashMap<>();
        
        char svar;
        boolean fortsatt = true;
        int rattsvar = 0;
        
        while (fortsatt) {
            System.out.println("DINA VAL");
            System.out.println("");
            System.out.println("1. Skapa gloslista");
            System.out.println("2. Visa gloslista");
            System.out.println("3. Lägg till glosa");
            System.out.println("4. Glosförhör");
            System.out.println("0. Avsluta");
            
            try {
                svar = sc.next().charAt(0);
                switch (svar) {
                    case '1':
                        ht.put("mamma", "mother");
                        ht.put("sol","sun");
                        ht.put("Skit", "poop");
                        ht.put("barn","child");
                        ht.put("pappa", "father");
                        ht.put("glad", "happy");
                        
                        System.out.println("GET ON YOUR BIKE ALABA!!!!!");
                        break;
                    case '2':
                        for (String nyckel : ht.keySet()) {
                            System.out.print(nyckel + ": ");
                            System.out.println(ht.get(nyckel));
                        }
                        break;
                    case '3':
                        System.out.println("Ange det svenska order: ");
                        String sv = sc.next();
                        System.out.println("Ange det engelska ordet: ");
                        String en = sc.next();
                        ht.put(sv, en);
                         break;
                    case '4':
                        for (String nyckel : ht.keySet()) {
                            System.out.println("vad är det engelska ordet för " + nyckel);
                            String svaret = sc.next();
                            if (svaret.equals(ht.get(nyckel))) {
                                System.out.println("ALABA GOT ON HIS BIKE");
                                rattsvar++;
                            }else{
                                System.out.println("NOOOOT");
                            }
                        }
                        System.out.println("Du fick " + rattsvar + " rätt");
                        break;
                    case '0':
                        System.out.println("BYEBYE");
                        fortsatt = false;
                        System.out.println("hej mamma");
                        break;
                    
                }
            } catch (Exception e) {
                System.out.println("DENCH FAILURE");
            }
        }
    }
}
