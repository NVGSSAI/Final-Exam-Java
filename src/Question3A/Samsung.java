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
public class Samsung extends Phone{
    private String googleId,Model; 

    public Samsung(String googleId, String Model, String OS, int price) {
        super(OS, price);
        this.googleId = googleId;
        this.Model = Model;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
    public String getPhoneDetails() {
       return super.getPhoneDetails()+" "+googleId+" "+Model;
     }

    @Override
    public String toString() {
        return "Samsung{" + "googleId=" + googleId + ", Model=" + Model + '}';
    }
    
   
}
