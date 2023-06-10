package org.example.recursion;

public class PrintFirstNNumbers {

    public static void main(String[] args) {

        int digits = 5;
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        print(input, digits);
    }

    private static void print(int[] arr, int digitCount) {

        if (digitCount == 5) {
            return;
        }

        System.out.println(digitCount);
        print(arr, digitCount);
    }
}
