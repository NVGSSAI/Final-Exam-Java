/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class TvCompaniesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question-11: Venkata Gopi Siva Sai Nallapati");
        // TODO code application logic here
        TvCompanies tc1 = new TvCompanies("LG", 200);
        TvCompanies tc2 = new TvCompanies("Sony", 135);
        TvCompanies tc3 = new TvCompanies("vizo", 175);
        TvCompanies tc4 = new TvCompanies("LG", 200);

        /*
        * tc1 and tc4 have same tv names
        * hashcode method and equals method used to get the attributes for  tv name
        * For this attribute we can get hash code.
         */
        System.out.println("************** Hash Code ************** ");
        System.out.println(tc1.hashCode() + " : same value for tc4");
        System.out.println(tc2.hashCode() + " : Different value");
        System.out.println(tc3.hashCode() + " : Different value");
        System.out.println(tc4.hashCode() + " : same value for tc1");

        /*
        * The same hash code returns for the same tvName attribute 
         */
        System.out.println("*************** Equals *************** ");

        /*
        * Prints false because the tvName attribute was different for both the objects.
         */
        System.out.println(tc1.equals(tc3));
        /*
        * Prints true because the tvName attribute was same for both the objects.
         */
        System.out.println(tc1.equals(tc4));
        /*
        * Prints flase because the tvName attribute was different for both the objects.
         */
        System.out.println(tc3.equals(tc2));


    }
    
}
