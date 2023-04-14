package org.example.collections.fun;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyAndRemovingIntegers {

    public static void main(String[] args) {

        /** Whenever  we are creating a List of elements,
         *  all those elements gets autoboxed and wrapper class gets created */
        List list = List.of("A", 'A', 1, 1.0);
        System.out.println(list);
        System.out.println(list.get(2));

        System.out.println(list.get(2) instanceof Integer);
        System.out.println(list.get(1) instanceof Character);
        System.out.println(list.get(0) instanceof String);
        System.out.println(list.get(3) instanceof Double);

        /** If you want only a specific type of values to be stored in your List
         * Generalisation comes into picture */
        //List<String> textValues = List.of("A", 'A', 1, 1.0); //Will throw exception 'cause only String types are allowed
        List<Integer> numbers = List.of(101, 102, 104, 106);
        System.out.println(numbers.indexOf(101));

        List<Integer> numbersAL = new ArrayList<>(numbers);
        System.out.println(numbersAL);
        System.out.println(numbersAL.indexOf(101));

        /** remove method has two different method signatures
         *  remove(Object o);
         *  remove(int index);
         */
        //numbersAL.remove(101);
        numbersAL.remove(Integer.valueOf(101));//We can also use new Integer(101) but Integer.valueOf() is much more efficient
        System.out.println(numbersAL);
    }

}
