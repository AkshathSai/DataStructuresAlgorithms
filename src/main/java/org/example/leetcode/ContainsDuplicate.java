package org.example.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class ContainsDuplicate {

    public static void main(String[] args) {

        log.info("Contains Duplicate: {}", containsDuplicateWithGenericSet(List.of(1, 2, 3, 1, 4, 5)));
        log.info("Contains Duplicate: {}", containsDuplicateWithGenericSet(List.of(1, 2, 3, 4, 5, 6, 7)));
        log.info("Contains Duplicate: {}", containsDuplicateWithSet(List.of(1, 2, 3, 1, 4, 5)));
        log.info("Contains Duplicate: {}", containsDuplicateWithSet(List.of(1, 2, 3, 4, 5, 6, 7)));
        log.info("Contains Duplicate: {}", containsDuplicateWithMap(List.of(1, 2, 3, 1, 4, 5)));
        log.info("Contains Duplicate: {}", containsDuplicateWithMap(List.of(1, 2, 3, 4, 5, 6, 7)));

    }

    private static boolean containsDuplicateWithGenericSet(List<?> elements) {
        Set<?> setOfElements = new HashSet<>(elements);
        return elements.size() != setOfElements.size();
    }

    private static boolean containsDuplicateWithSet(List<Integer> listOfNumbers) {
        Set<Integer> setOfNumbers = new HashSet<>(listOfNumbers);
        return listOfNumbers.size() != setOfNumbers.size();
    }

    private static boolean containsDuplicateWithMap(List<Integer> listOfNumbers) {
        Map<Integer , Integer> map = new HashMap<>();

        for (Integer number: listOfNumbers) {

            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
                return true;
            } else {
                map.put(number, 1);
            }

        }

        return false;
    }

}
