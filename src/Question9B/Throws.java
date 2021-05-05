/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9B;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Throws {

    /**
     * @param a
     * @param b
     * @return 
     */
    public int division(int a, int b) throws ArithmeticException {
        int d = a / b;
        return d;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Answer for Question-9 example 9B Venkata Gopi Siva Sai Nallapati");
    Throws thr = new Throws();
        try {
            System.out.println(thr.division(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("you should not divide number by Zero");
        }
    }  
}
