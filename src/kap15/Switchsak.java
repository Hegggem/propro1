/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Marcus Heggem
 */
public class Switchsak {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<String> namnLista = new LinkedList<>();
        
        int val = 1;
       boolean fortsatt = true;
       String namn;
       int plats;
       
        while (fortsatt) {
            
            if (namnLista.isEmpty()) {
                
            }else{
                for (int i = 0; i < namnLista.size(); i++) {
                    System.out.println(i + ". " + namnLista.get(i));
                }
            }
        
            System.out.println("Välj ett alternativ....");

            System.out.println("");
            System.out.println("1. Fyll listan med namn");
            System.out.println("2. Lögg till namn ");
            System.out.println("3. lägg till ett namn på en viss plats");
            System.out.println("4. Se element nummer......");
            System.out.println("5. TA bort element nummer");
            System.out.println("6. Ta bort ett namn");
            System.out.println("7. ta bot alla");
            System.out.println("0. Avsluta detta bullsheit");

            val = sc.nextInt();

                switch (val) {
                    case 1:
                        char laggTillNamn = 'n';                     
                        namnLista.add("Kalle"); 
                        namnLista.add("Lisa");
                        namnLista.add("Anna"); 
                        namnLista.add("Johan");
                        namnLista.add("Stina"); 
                        namnLista.add("Pelle");
                        break;
                    case 2:
                        
                        System.out.print("Ange namnet: ");
                        namn = sc.next();
                        
                        if (!namn.equals("")) {
                            namnLista.add(namn);
                        }
                                                
                        break;
                    case 3:
                        System.out.println("Ange platsen");
                        plats = sc.nextInt();
                        System.out.println("ange namnet");
                        namn =sc.next();
                        namnLista.add(plats, namn);
                        break;
                    case 4:
                        System.out.print("ange vilken du vill granska");
                        plats = sc.nextInt();
                        System.out.println("platsen har namnet: " + namnLista.get(plats));
                        break;
                    case 5:
                        System.out.println("Ange platsen du vill ta bort");
                        plats = sc.nextInt();
                        namnLista.remove(plats);
                        break;
                    case 6:
                        System.out.println("ange namnet du vill ta bort");
                        namn = sc.next();
                        boolean hittad = false;
                                   
                            for (String namnetIListan : namnLista) {
                                if (namnetIListan.equals(namn)) {
                                    namnLista.remove(namn);
                                    hittad = true;
                                }//end if
                            }//end fore

                        
                        
                        if (!namn.equals("")) {
                            namnLista.remove(namn);
                        }
                        break;
                    case 7:
                        System.out.println("Ta bort listan (j/n)");
                        char svar = sc.next().charAt(0);
                                if(svar == 'j'){
                                    namnLista.clear();
                                }else{
                                    System.out.println("du ångrade dig, make your mind up !");
                                }
                        break;
                    case 0:
                        System.out.println("hejdå ;D;D;D;D;D;D;");
                        break;

                    default:
                        System.out.println("försök igen.... skriv in ett tal mellan 0-7");
            }//end switch
        
        }//end while
    }

}
