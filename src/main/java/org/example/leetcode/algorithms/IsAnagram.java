package org.example.leetcode.algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsAnagram {

    public static void main(String[] args) {

        // Positive case
        String s1 = "anagram";
        String s2 = "nagaram";

        // Negative case
        String s3 = "rat";
        String s4 = "car";

        // call your methods here
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

    private static boolean isAnagramWithArray(String s1, String s2) {
        // TODO

        return false;
    }

    private static boolean isAnagramWithSortCheck(String s1, String s2) {
        // TODO

        return false;
    }

}
