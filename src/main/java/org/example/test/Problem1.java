package org.example.test;

import java.util.*;

public class Problem1 {

    public static int minDistinctIDs(int n, List<Integer> ids, int m) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each ID
        for (int id : ids) {
            countMap.put(id, countMap.getOrDefault(id, 0) + 1);
        }

        // Create a list of ID frequencies
        List<Integer> frequencies = new ArrayList<>(countMap.values());
        Collections.sort(frequencies);

        // Calculate the minimum number of distinct IDs remaining
        int minDistinct = frequencies.size();
        for (int i = 0; i < frequencies.size() && m > 0; i++) {
            if (frequencies.get(i) <= m) {
                m -= frequencies.get(i);
                minDistinct--;
            } else  {
                break;
            }
        }

        return minDistinct;
    }

    public static void main(String[] args) {
        int n = 6;
        List<Integer> ids = Arrays.asList(1, 1, 1, 2, 3, 2);
        int m = 2;

        int result = minDistinctIDs(n, ids, m);
        System.out.println("The minimum number of distinct IDs is " + result); // Output: 2
    }

}
