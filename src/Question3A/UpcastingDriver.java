/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class UpcastingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Answer for Question-3A: Venkata Gopi Siva Sai Nallapati");
    Phone phone1 = new Iphone("vv@icloud","4s","IOS",50000);
    System.out.println(phone1.getPhoneDetails());
    Phone phone2 = new Samsung("bb@gmail","X500","Android",44000);
    System.out.println(phone2.getPhoneDetails());
 
    }
    
}
