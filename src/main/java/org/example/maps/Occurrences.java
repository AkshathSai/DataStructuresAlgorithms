package org.example.maps;

import java.util.HashMap;
import java.util.Map;

public class Occurrences {

    public static void main(String[] args) {


        String str = "Challenger of the Status Quo.";

        Map<Character, Integer> occurrences = new HashMap<>();

        char[] characters = str.toCharArray();


        for (char character: characters) {

            //Get the Character
            Integer count = occurrences.get(character);

            if(count == null) {//If it is  not there, initialize to 1
                occurrences.put(character, 1);
            } else {//If it is there, increment the count
                occurrences.put(character, count+1);
            }
        }
        System.out.println(occurrences);
    }

}
