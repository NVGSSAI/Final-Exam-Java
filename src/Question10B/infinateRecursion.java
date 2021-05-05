/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10B;

import java.util.Scanner;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class infinateRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Answer for Question-10 infinate recursion example 10B: Venkata Gopi Siva Sai Nallapati");
        System.out.print("Enter n :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        try {
            System.out.println(infiniteRecursion(n));
        } catch (java.lang.StackOverflowError ex) {
            System.out.println("infinite recursion" + ex);
        }
    }

    private static String infiniteRecursion(int n) {
        if (true) {
            return "infinite recursion" + "\n" + infiniteRecursion(n + 1);
        } else {
            return "";
        }
    }
}
  
