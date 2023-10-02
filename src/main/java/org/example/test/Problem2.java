package org.example.test;

public class Problem2 {

    static int countHighlyProfitableMonths(int[] stockPrices, int k) {
        int n = stockPrices.length;
        int count = 0;
        int profitableStreak = 1; // start from 1 as we'll compare from the second element

        for (int i = 1; i < n; i++) {
            if (stockPrices[i] > stockPrices[i-1]) {
                profitableStreak++;
                if (profitableStreak == k) {
                    count++;
                    profitableStreak--; // shift the window
                }
            } else {
                profitableStreak = 1; // reset the streak
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int[] stockPrices = {1, 2, 3, 3, 4, 5};
        int k = 3;
        System.out.println(countHighlyProfitableMonths(stockPrices, k)); // Expected output: 2
    }

}