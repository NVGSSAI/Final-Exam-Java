/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3B;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class downcastingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question-3B: Venkata Gopi Siva Sai Nallapati");
        Phone p1=new Phone("IOS",35000);
        System.out.println(p1.getPhoneDetails());
        Iphone i1=new Iphone("abc@icloud","6s","IOS",50000);
        p1=i1;
        i1=(Iphone)p1;
        System.out.println(i1.getPhoneDetails());
    }
    
}
