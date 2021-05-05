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
public class Phone {
    private String OS;
    private int price;

    public Phone(String OS, int price) {
        this.OS = OS;
        this.price = price;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getPhoneDetails() {
        return OS+" "+price;
     }

    @Override
    public String toString() {
        return "Phone{" + "OS=" + OS + ", price=" + price + '}';
    }
    
}
