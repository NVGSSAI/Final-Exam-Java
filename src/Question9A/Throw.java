/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Throw {

    /**
     * @param SD
     */
    public void SubmissionDate(int SD) {
        if (SD > 05) {
            throw new ArithmeticException("Date hasbeen exceeded");
        } else {
            System.out.println("Assignment submitted");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Answer for Question-9 example 9A: Venkata Gopi Siva Sai Nallapati");
    Throw tr=new Throw();
    tr.SubmissionDate(02);
    System.out.println("End Of Program");
        }
    }
