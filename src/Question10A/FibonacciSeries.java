/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class FibonacciSeries {

    /**
     * @param n
     * @return 
     */
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question-10 recursion example 10A: Venkata Gopi Siva Sai Nallapati");
        int number = 15;
        System.out.println("Fibonacci Series For First 15 numbers:");
        for (int i = 1; i <= number; i++) {
        System.out.print(fibo(i) + " ");
        }
    }
    
}
