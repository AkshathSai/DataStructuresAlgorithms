package org.example.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
public class ContainsDuplicate {

    public static void main(String[] args) {

        log.info("Contains Duplicate: {}", containsDuplicateWithSet(List.of(1, 2, 3, 1, 4, 5)));
        log.info("Contains Duplicate: {}", containsDuplicateWithSet(List.of(1, 2, 3, 4, 5, 6, 7)));
    }

    private static boolean containsDuplicateWithSet(List<?> elements) {
        Set<?> setOfElements = new HashSet<>(elements);
        return elements.size() != setOfElements.size();
    }


}
