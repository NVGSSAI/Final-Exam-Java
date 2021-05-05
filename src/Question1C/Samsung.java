/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1C;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Samsung implements TvTypes{
private static final String TvName="SAMSUNG";
private static final String TvOs="ANDROID";
private static final String TvRemote="SAMSUNG REMOTE";
    @Override
    public void TvName() {
        System.out.println("Tv Name: "+TvName);
    }

    @Override
    public void TvOs() {
        System.out.println("Tv Os: "+TvOs);
    }

    @Override
    public void TvRemote() {
        System.out.println("Tv Remote: "+TvRemote);
    }
    
}
