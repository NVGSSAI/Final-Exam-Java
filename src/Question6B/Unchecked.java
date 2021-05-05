/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6B;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Unchecked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question-6B: Venkata Gopi Siva Sai Nallapati");
        ArrayList<String> nlist = new ArrayList<String>();
        nlist.add("cat");
        nlist.add("horse");
        nlist.add("camel");
        nlist.add("hippo");
        nlist.add("donkey");
        Scanner scan = new Scanner(System.in);
        System.out.println("Index 1 has an animal: " + nlist.get(1));
        System.out.println("Index 2 has an animal: " + nlist.get(2));
        System.out.println("Index 10 has an animal: " + nlist.get(10));
    }
    
}
