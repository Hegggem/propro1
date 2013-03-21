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
public class HashTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String,String> ht = new HashMap<>();
        ht.put("Sverige", "Stockholm");
        ht.put("Danmark","Köpenhamn");
        ht.put("Finland", "Helsingfors");
        ht.put("Norge","Oslo");
        System.out.println("Vilket lands huvudstad vill du checka ?");
        String land = sc.nextLine();
        while (!land.equals("#")) {
            System.out.println("Landets huvudstad är: " + ht.get(land));
            System.out.println("land?");
            land = sc.nextLine();
        }
        System.out.println("GET ON YOUR BIKE ALABA");
    }
}
