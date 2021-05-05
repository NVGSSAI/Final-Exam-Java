/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

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
        System.out.println("Answer for Question-2: Venkata Gopi Siva Sai Nallapati");
        GeometricObject[] geometricObjects = new GeometricObject[5];

        geometricObjects[0] = new Square(4.3, false);
        geometricObjects[1] = new Square(8.3, true);
        geometricObjects[2] = new Square(3.6, true);
        geometricObjects[3] = new Square(6.0, false);
        geometricObjects[4] = new Square(5.5, true);

        for (GeometricObject geometricObject : geometricObjects) {
            System.out.println("Area: " + geometricObject.calculateArea());
            if (geometricObject.isColorable() == true) {
                Square square = (Square) geometricObject;
                square.howToColor();
            }
            System.out.println("**********************************");
        }

    }

}
