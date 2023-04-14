package org.example.strings;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "Brogrammer";

        reverses(str);
    }

    /**
     * Naive/Brute force approach:
     * Just print the String in the reverse order
     *
     * worst case: What if there's a million long character String?
     * A million for loop iterations?
     *
     * Time complexity: O(n)
     *
     * @param str
     */
    /*private static void reverses(String str) {

        char[] temp = str.toCharArray();

        String newString = "";

        for (int i=str.length()-1; i>=0; i--) {
            //System.out.print(temp[i]);
            newString = newString + temp[i];
        }

        System.out.println(newString);

    }*/

    /** What if the string is a million characters long?
     * That would be a million operations to work through! Can we improve it?
     * */

    /** Yes, with more pointers
     *
     * Well, we're only working with a single pointer right now.
     * The iterator from our loop starts from the back, and appends each character to a new string, one by one.
     *
     * Time complexity: still the same as above 0(n) although the number of operations required are cut in half
     *
     * @param str
     */
    /*private static void reverses(String str) {

        char[] newString = str.toCharArray();

        for (int i=0, j = str.length()-1; i<j ; i++, j--) {
            char temp = newString[i];
            newString[i] = newString[j];
            newString[j] = temp;
        }

        new String(newString);

        System.out.println(newString);
    }*/

    /**
     * Cleanest way by using built-in methods of Java
     */
    public static void reverses(String str) {

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);
    }

}
