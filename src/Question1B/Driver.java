/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1B;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question-01 Abstract class example 1B:Venkata Gopi Siva Sai Nallapati");
        Orange or=new Orange();
        or.treeName();
        or.fruitName();
        or.fruitColor();
        System.out.println("*************************");
        Pineapple pi=new Pineapple();
        pi.treeName();
        pi.fruitName();
        pi.fruitColor();
    }
    
}
