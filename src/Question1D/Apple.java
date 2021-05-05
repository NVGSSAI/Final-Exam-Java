/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1D;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Apple implements Phone{
public static final String PhoneName="Apple";
public static final String PhoneOs="IOS";
public static final int PhonePrice=1000;
    @Override
    public void PhoneName() {
    System.out.println("Phone Name: "+PhoneName);
    }

    @Override
    public void PhoneOs() {
    System.out.println("Phone Os: "+PhoneOs);
    }

    @Override
    public void PhonePrice() {
    System.out.println("Phone Price: "+PhonePrice);
    }
    
}
