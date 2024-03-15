package org.example.leetcode.algorithms;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GreatestElementOnRight {

    public static void main(String[] args) {
        log.info("Output: {}", replaceElements(new int[]{17,18,5,4,6,1}));
        log.info("Output: {}", replaceElements(new int[]{400}));
    }

    public static int[] replaceElements(int[] arr) {
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
        }
        return arr;
    }

}
