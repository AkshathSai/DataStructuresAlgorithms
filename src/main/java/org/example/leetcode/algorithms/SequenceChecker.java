package org.example.leetcode.algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SequenceChecker {

    public static void main(String[] args) {
        log.info("{}", isSubsequence("abc", "ahbgdc"));
        log.info("{}", isSubsequence("axc", "ahbgdc"));
    }

    private static boolean isSubsequence(String subSequence, String t) {

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
