/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8B;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class roomArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question-8B Venkata Gopi Siva Sai Nallapati");
        double length = 0;
        double breadth = 0;
        System.out.println("Enter length of room");
        Scanner s2 = new Scanner(System.in);
        try {
            length = s2.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception,Length can be only double");
        }

        System.out.println("enter breadth of room");
        Scanner s3 = new Scanner(System.in);
        try {
            breadth = s2.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception, breadth can be only double");
        }

        System.out.println("Area of room is: "
                + calculateRoomArea(length, breadth));

    }

    public static double calculateRoomArea(double length, double breadth) {
        return length * breadth;
    }

}
