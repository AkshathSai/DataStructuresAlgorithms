package org.example.datastructures.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> occurrences = new HashMap<>();
        // Step 1: Count the frequency of each element
        for (int num : nums) {
            if (occurrences.containsKey(num)) {
                occurrences.put(num, occurrences.get(num) + 1);
            } else {
                occurrences.put(num, 1);
            }
        }

        // Step 2: Return the num array whose occurrence is greater than 1
        int[] result = new int[k];
        int index = 0;

        // sort the occurrences in descending order based on their values before converting to key value pairs
        occurrences = occurrences
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (var occurrence : occurrences.entrySet()) {
            if (index == k) {
                break;
            }
            //if (occurrence.getValue() > 1) {
            result[index] = occurrence.getKey();
            //}
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();
        // Input: nums = [1,1,1,2,2,3], k = 2
        // Output: [1,2]
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);
        for (int i : result) {
            System.out.println(i);
        }
    }
}