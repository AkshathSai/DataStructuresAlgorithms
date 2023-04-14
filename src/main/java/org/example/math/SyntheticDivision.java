package org.example.math;

public class SyntheticDivision {

    public static void main(String[] args) {

        int[] coefficients = {1, 5};
        int factor = 6;

        syntheticDivision(coefficients, factor);
    }

    private static void syntheticDivision(int[] coefficients, int factor) {

        int n = coefficients.length;

        int[] out = new int[n - 1];
        
        for (int i=0; i<n-1; i++) {
            
            int multiplier;

            if (i==1) {
                multiplier = factor;
            } else {
                multiplier = out[i] * coefficients[i];
            }
            
            int coefficient = coefficients[i];
            out[i] = coefficient;
        }

        printResult(out);
    }

    private static void printResult(int[] out) {

        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }

    }

}
