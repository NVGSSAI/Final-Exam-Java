/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Question7 {

    public static void main(String[] args) {
        int numbers[] = new int[100];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int)(Math.random() * 100);
        }
        System.out.println("Answer for Question-7: Venkata Gopi Siva Sai Nallapati");

        System.out.print("Enter an index to find the integer: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        try {
            System.out.println("Integer at index " + index + " is "
                    + numbers[index]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
