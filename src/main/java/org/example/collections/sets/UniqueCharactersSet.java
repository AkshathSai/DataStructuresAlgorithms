package org.example.collections.sets;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
public class UniqueCharactersSet {

    public static void main(String[] args) {

        List<Character> characters = List.of('A', 'B','C','A','B','F','C');

        Set<Character> uniqueCharactersSet = new HashSet<>(characters);

        LOGGER.info("Unique Characters Set: " + uniqueCharactersSet);
    }
}
