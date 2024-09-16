package org.example.algorithms.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fibonacci {

    public static void main(String[] args) {
        log.info("{}", nThFibonacciNumber(10));
        generateSequenceUpto(25);
    }

    public static int nThFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        } else {
            return nThFibonacciNumber(n - 1) + nThFibonacciNumber(n - 2);
        }
    }

    public static void generateSequenceUpto(int digits) {
        int[] sequence = new int[digits + 1];
        if (digits < 0) {
            return;
        } else {
            for (int iteration=0; iteration<=digits; iteration++) {
                sequence[iteration] = nThFibonacciNumber(iteration);
            }
        }
        log.info("{}", sequence);
    }
}
