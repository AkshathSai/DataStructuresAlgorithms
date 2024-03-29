package org.example.algorithms.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Factorial {

    public static void main(String[] args) {

        log.info("Factorial value " + factorial(5));

    }

    private static int factorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorial( n-1);
    }

}
