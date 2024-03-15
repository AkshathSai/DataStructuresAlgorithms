package org.example.leetcode.algorithms;

import lombok.extern.slf4j.Slf4j;

/**
 * @see https://leetcode.com/problems/concatenation-of-array/description/
 */
@Slf4j
public class ConcatenationOfTwoArrays {

    public static void main(String[] args) {

        log.info("{}", getConcatenation(new int[]{1, 2, 1}));
        log.info("{}", getConcatenation(new int[]{1, 3, 2, 1}));
    }

    private static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];

        int i=0;
        for (int num: nums) {
            ans[i] = num;
            ans[i + nums.length] = num;
            i++;
        }

        return ans;
    }

}
