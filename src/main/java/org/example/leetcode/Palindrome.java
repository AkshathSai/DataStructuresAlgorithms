package org.example.leetcode;


public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(141));
    }

    private static boolean isPalindrome(int n) {

        boolean flag = false;

        char[] charArray = new char[n];
        //char[] charArray = new char[n];

        for (int i=0; i<=charArray.length; i++) {

           if (charArray[0] == charArray[2]) {
               flag = true;
           }

        }

        return flag;

    }
}
