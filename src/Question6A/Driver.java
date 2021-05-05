/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for Question-6A: Venkata Gopi Siva Sai Nallapati");
        System.out.println("we are going to access file that is not exist so we will get filenotfound exception");   
        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNext()){
         int chargerPrice =sc.nextInt();
         String chargerName=sc.next();
         Charger c = new Charger(chargerPrice, chargerName);  
        }
        } 
}
