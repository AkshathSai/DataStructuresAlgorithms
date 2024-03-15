package org.example.leetcode.algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

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

    private static boolean isAnagramWithMap(String s1, String s2) {
        // TODO

        return false;
    }

    private static boolean isAnagramWithArray(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int arr[] = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        char c[] = s.toCharArray();
        char c1[] = t.toCharArray();
        for (int i = 0; i < c.length; i++) {
            arr[c[i] - 'a']++;

        }
        for (int i = 0; i < c.length; i++) {

            arr[c1[i] - 'a']--;
        }

        for (int a : arr) {
            if (a != 0) {
                return false;
            }
        }

        return true;
    }
    

    private static boolean isAnagramWithSortCheck(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        Arrays.sort(charArray1);
        s1 = new String(charArray1);
        log.info("s1 {}", s1);

        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray2);
        s2 = new String(charArray2);
        log.info("s2 {}", s2);

        return s1.equals(s2);
    }

}
