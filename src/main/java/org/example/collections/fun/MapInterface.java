package org.example.collections.fun;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {

    public static void main(String[] args) {

        /** HashMap -
         *  unordered, unsorted
         *  hashcode() Function is used for Keys
         */
        HashMap<Integer, String> map = new HashMap<>();

        map.put(3, "Cherry");
        map.put(4, "Susmitha");
        map.put(2,"Vinay");
        map.put(1,"Akshath");

        System.out.println("Given Map: \n"+ map);

        System.out.println("What are the names of the crew? " + map.values());
        System.out.println("What are the codenames of the crew? " + map.keySet());

        map.remove(1);
        map.remove(2, "Vinay");

        map.put(5, null);

        System.out.println("Get me Vinay: " + map.get(2));
        System.out.println("Contains Akshath? " + map.containsKey(1));

        //Returns a Set view
        System.out.println("Printing the Set view of the Map: \n" + map.entrySet());
        System.out.println("Beginning the Transfer of data...");

        /** Hashtable
         *
         *  synchronized - Thread safe version of HashMap
         *  unordered, unsorted
         *  hashcode() function is used
         *  Only difference between HashMap and Hashtable is:
         *  HashMap allows a key with null value, Hashtable doesn't
         *
         */
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        try {
            hashtable.putAll(map);
        } catch (NullPointerException e) {
            System.out.println("Gotcha! Told 'ya Hashtable doesn't allow null value");
            //e.printStackTrace();
        }

        //Clear the HashMap
        map.clear();
        System.out.println("Transferred the data to Hashtable and cleared the HashMap... " + map);

        System.out.println("Resurrecting Akshath again in Hashtable " + hashtable.put(1,"Akshath"));

        System.out.println("Data in Hashtable: \n" + hashtable);
        System.out.println("Beginning Transfer...");

        /** LinkedHashMap -
         *  insertion order is maintained
         *  Slower insertion and deletion speeds
         *  Faster Iteration due to the link between the elements
         */
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putAll(hashtable);

        System.out.println("Arrived at LinkedHashMap \n" + linkedHashMap);
        System.out.println("Where the f*** is Vinay? " + linkedHashMap.containsValue("Vinay"));
        System.out.println("Resurrecting Vinay, Operation VLion begins... " + linkedHashMap.put(2, "Vinay"));

        System.out.println("Crew count now: " + linkedHashMap.size());

        System.out.println("Operation VLion success! Teleporting to the next world");

        /** Treemap -
         *  sorted
         *  Implements Navigable map
         */
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.putAll(linkedHashMap);

        System.out.println("Arrived at TreeMap!\nThe mysterious power of TreeMap sorted out us in order again... \n" + treeMap);
        System.out.println("Select Viny, Cherry and Susmitha for Resource Gathering " + treeMap.subMap(1, true, 3, true));

        System.out.println("Select the First one in team " + treeMap.firstEntry());
        System.out.println("Who was the next person who joined after Akshath? " + treeMap.higherKey(1));
        System.out.println("Can you name the person along with the Key? " + treeMap.higherEntry(1));
        System.out.println("Can you name who joined before Cherry? " + treeMap.lowerKey(3));
        System.out.println("Can you name the person along with the Key? " + treeMap.lowerEntry(3));
        System.out.println("Select the Last one in team " + treeMap.lastEntry());

    }

}
