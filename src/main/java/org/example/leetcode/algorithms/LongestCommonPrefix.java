package org.example.leetcode.algorithms;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @see https://leetcode.com/problems/longest-common-prefix/
 */
@Slf4j
public class LongestCommonPrefix {

    public static void main(String[] args) {
        log.info("{}", longestCommonPrefix(new String[]{"flower","flow","flight"}));
        log.info("{}", longestCommonPrefix(new String[]{"ab","a"}));
        log.info("{}", longestCommonPrefixV2(new String[]{"flower","flow","flight"}));
        log.info("{}", longestCommonPrefixV2(new String[]{"ab","a"}));
    }

    /**
     * Brute force - Naive approach
     */
    private static String longestCommonPrefix(String[] strings) {

        if(strings.length == 1) {
            return strings[0];
        }

        Arrays.sort(strings); // arranges Strings in ascending order length

        String firstString = strings[0];
        String lastString = strings[strings.length - 1];

        StringBuilder stringBuilder = new StringBuilder();
        int prefixIndex=0;
        while (prefixIndex<firstString.length()) {
            if (firstString.charAt(prefixIndex) == lastString.charAt(prefixIndex)) {
                stringBuilder.append(firstString.charAt(prefixIndex));
                prefixIndex++;
            } else {
                break;
            }
        }

        return stringBuilder.toString();
    }

    /**
     * 0 ms runtime speed optimized
     */
    public static String longestCommonPrefixV2(String[] strings) {
        if(strings.length == 1) {
            return strings[0];
        }

        Arrays.sort(strings); // arranges Strings in ascending order length

        String firstString = strings[0];
        String lastString = strings[strings.length - 1];

        int prefixIndex=0;
        while (prefixIndex<firstString.length()) {
            if (firstString.charAt(prefixIndex) == lastString.charAt(prefixIndex)) {
                prefixIndex++;
            } else {
                break;
            }
        }

        return firstString.substring(0, prefixIndex);
    }

}
