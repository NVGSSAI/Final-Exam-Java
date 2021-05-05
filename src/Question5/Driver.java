/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComparableCircle c1 = new ComparableCircle(18.5);
        ComparableCircle c2 = new ComparableCircle(12.5);
        System.out.println("Answer for Question-5: Venkata Gopi Siva Sai Nallapati");

        System.out.println("Area of C1: "+c1.calculateArea());
        System.out.println("Area of C2: "+c2.calculateArea());

        if (c1.compareTo(c2) == 0) {
            System.out.println("Both the circles have same area");
        } else if (c1.compareTo(c2) > 0) {
            System.out.println("Area of circle C1 is greater than C2");
        } else {
            System.out.println("Area of circle C2 is smaller than C1");
        }

    }

}
