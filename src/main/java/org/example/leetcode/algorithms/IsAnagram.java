package org.example.leetcode.algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @see https://leetcode.com/problems/valid-anagram
 */
@Slf4j
public class IsAnagram {

    public static void main(String[] args) {

        // Positive case
        String s1 = "anagram";
        String s2 = "nagaram";

        // Negative case
        String s3 = "rat";
        String s4 = "car";

        log.info("Is Anagram? {}", isAnagramWithMap(s1, s2));
        log.info("Is Anagram? {}", isAnagramWithMap(s3, s4));
        log.info("Is Anagram? {}", isAnagramWithArray(s1, s2));
        log.info("Is Anagram? {}", isAnagramWithArray(s3, s4));
        log.info("Is Anagram? {}", isAnagramWithSortCheck(s1, s2));
        log.info("Is Anagram? {}", isAnagramWithSortCheck(s3, s4));
    }

    private static boolean isAnagramWithMap(String s, String t) {
        // TODO

        return false;
    }

    private static boolean isAnagramWithArray(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int arr[] = new int[26];

        char c[] = s.toCharArray();
        char c1[] = t.toCharArray();
        for (int i = 0; i < c.length; i++) {
            arr[c[i] - 'a']++;
            arr[c1[i] - 'a']--;
        }

        for (int a : arr) {
            if (a != 0) {
                return false;
            }
        }

        return true;
    }
    

    private static boolean isAnagramWithSortCheck(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        char[] charArray1 = s.toCharArray();
        Arrays.sort(charArray1);
        s = new String(charArray1);
        log.info("s1 {}", s);

        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        t = new String(charArray2);
        log.info("s2 {}", t);

        return s.equals(t);
    }

}
