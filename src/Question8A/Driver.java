/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NullPointerException,ArithmeticException{
        // TODO code application logic here
    System.out.println("Answer for Question-8A: Venkata Gopi Siva Sai Nallapati");
    Meat m1=new Meat("chicken");
    m1.setPrice(20);
    System.out.println(m1);
    
    Meat m2 = new Meat("Lamb");
    m2.setPrice(12);
    
    Meat m3 = null;
    m3.setPrice(11);
    }    
    
}
