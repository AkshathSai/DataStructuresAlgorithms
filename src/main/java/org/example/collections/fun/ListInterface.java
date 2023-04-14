package org.example.collections.fun;

import java.util.*;

public class ListInterface {

    public static void main(String[] args)  {

        /*Java - 7,8 style
        List<String> list = Arrays.asList("Akshath", "Cherry", "Vinay", "Susmitha");
        System.out.println(list);*/

        //From Java 9 - of() creates an immutable list
        List<String> list = List.of("Akshath", "Cherry", "Vinay", "Susmitha");
        System.out.println("Starting the List Interface Journey...");

        System.out.println("Anyone missing on the Field? " + list.isEmpty());
        System.out.println("The Crew: " + list);
        System.out.println("Get me Cherry! \n" + list.get(1));
        System.out.println("Teleporting to ArrayList...");

        //Moving elements to arrayList for making a mutable list
        List<String> arrayList = new ArrayList<>(list);

        System.out.println("Someone's lost! (Not again) " + arrayList.remove(0));
        System.out.println("Resurrecting him at a random place...\nSucceeded? " + arrayList.add("Akshath"));
        System.out.println("Where is he located at? " + arrayList.indexOf("Akshath"));
        System.out.println("Crew contain Akshath? " + arrayList.contains("Akshath"));

        System.out.println("Teleporting to Vector and wiping out the traces from ArrayList...");
        List<String> vectorList = new Vector<>(arrayList);
        arrayList.clear();
        System.out.println("Arrived in Vector " + vectorList);

        System.out.println("Teleporting to LinkedList and wiping out traces in Vector");
        List<String> linkedList = new LinkedList<String>(vectorList);
        vectorList.clear();

        System.out.println("Crew is bonding together! Magic of LinkedList");
        System.out.println("Arrived in LinkedList " + linkedList);
        System.out.println("Journey Finished Successfully! Iterating the crew names");

        Iterator<String> wordsIterator = linkedList.iterator();

        while (wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
        }

    }

}
