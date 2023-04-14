package org.example.recursion;

import java.util.Scanner;

/**
 * Find the Nth Fibonacci number
 */
public class FibonacciNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number");
        long input = sc.nextLong();
        System.out.println(fibo(input));
    }

    private static long fibo(long n) {

        if(n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
