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
public class Iphone extends Phone{
private String appleId,Model;

    public Iphone(String appleId, String Model, String OS, int price) {
        super(OS, price);
        this.appleId = appleId;
        this.Model = Model;
    }
    public String getAppleId() {
        return appleId;
    }

    public void setAppleId(String appleId) {
        this.appleId = appleId;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
@Override
    public String getPhoneDetails() {
       return super.getPhoneDetails()+" "+appleId+" "+Model;
     }

    @Override
    public String toString() {
        return "Iphone{" + "appleId=" + appleId + ", Model=" + Model + '}';
    }

}
