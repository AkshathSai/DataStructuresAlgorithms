package org.example.collections.sets;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@Slf4j
public class SetApp {

    public static void main(String[] args) {

        /**
         * HashSet - doesn't care about the insertion order & sorted order
         */
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Cherry");
        hashSet.add("Banana");
        hashSet.add("Grapes");
        hashSet.add("Melon");
        hashSet.add("Citrus");

        LOGGER.info("HashSet: " + hashSet);

        /**
         * LinkedHashSet - maintains insertion order but doesn't care about sorted order
         */
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Melon");
        linkedHashSet.add("Citrus");

        LOGGER.info("LinkedHastSet: " + linkedHashSet);

        /**
         * TreeSet - maintains sorted order
         */
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Banana");
        treeSet.add("Grapes");
        treeSet.add("Melon");
        treeSet.add("Citrus");

        LOGGER.info("TreeSet: " + treeSet);
    }
}
