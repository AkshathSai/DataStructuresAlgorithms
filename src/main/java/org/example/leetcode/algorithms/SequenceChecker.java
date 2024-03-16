package org.example.leetcode.algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SequenceChecker {

    public static void main(String[] args) {
        log.info("{}", isSubsequence("abc", "ahbgdc"));
        log.info("{}", isSubsequence("axc", "ahbgdc"));
        log.info("{}", isSubsequence("b", "abc"));
    }

    private static boolean isSubsequence(String subSequence, String originalString) {

        int matches = 0;
        int i = 0;
        for (char character: originalString.toCharArray()) {
            if (character == subSequence.charAt(i)) {
                matches++;
                if (i < subSequence.length() - 1) {
                    i++; // next char in subSequence
                }
            }
        }

        return subSequence.length() == matches;
    }

    private static boolean isSubsequenceV2(String subSequence, String t) {

        int subSeqPtr = 0;
        int originalStringPtr = 0;

        while (subSeqPtr < subSequence.length() && originalStringPtr < t.length()) {
            if (subSequence.charAt(subSeqPtr) == t.charAt(originalStringPtr)) {
                subSeqPtr++;
            }

            originalStringPtr++;
        }

        return subSeqPtr == subSequence.length();
    }

}
