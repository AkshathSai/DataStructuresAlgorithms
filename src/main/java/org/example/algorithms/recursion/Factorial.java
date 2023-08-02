package org.example.algorithms.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Factorial {

    public static void main(String[] args) {

        LOGGER.info("Factorial value " + factorial(3));

    }

    private static int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorial( n-1);
    }

}
