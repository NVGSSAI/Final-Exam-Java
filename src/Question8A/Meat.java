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
public class Meat {
private String MeatName;
private int price;

    public Meat(String MeatName) {
        this.MeatName = MeatName;
    }

    public void setPrice(int price) {
        if(price<=0){
         throw new ArithmeticException("Meat price cannot be Zero or less than zero");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meat{" + "MeatName=" + MeatName + ", price=" + price + '}';
    }

}
