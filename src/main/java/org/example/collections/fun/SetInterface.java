package org.example.collections.fun;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

    public static void main(String[] args) {

        Set<String> set = Set.of("Apple", "Banana", "Cherry");

        Set<String> hashset = new HashSet<>(set);

        System.out.println(hashset.add("Apple"));

    }
}
