/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Charger {
private int chargerPrice;
private String chargerName;

    public Charger(int chargerPrice, String chargerName) {
        this.chargerPrice = chargerPrice;
        this.chargerName = chargerName;
    }

    @Override
    public String toString() {
        return "Charger{" + "chargerPrice=" + chargerPrice + ", chargerName=" + chargerName + '}';
    }   
}
