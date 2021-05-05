/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("Answer for Question-01 Abstract class example 1A:Venkata Gopi Siva Sai Nallapati");
     India ind= new India();
     ind.countryName();
     ind.continent();
     ind.languageName();
     System.out.println("***************");
     USA con=new USA();
     con.countryName();
     con.continent();
     con.languageName();
    }
    
}
