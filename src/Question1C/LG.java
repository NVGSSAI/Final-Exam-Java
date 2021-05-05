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
public class LG implements TvTypes{
private static final String TvName="LG";
private static final String TvOs="WebOS";
private static final String TvRemote="MagicRemote";
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
