package org.example.algorithms.sorting;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Sort<T extends Comparable<T>> {


    public static void bubbleSort(int[] array) {
        System.out.println("Bubble Sort v2 [Before sort]: ");
        Arrays.stream(array).forEach(System.out::print);
        System.out.println(" ");

        // Iteration loop
        for (int i=0; i<array.length-1; i++) {

            short swap=0;
            for(int j=0; j<array.length-i-1;j++) { // Comparison loop
                if (array[j] > array[j+1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap++;
                }
            }
            log.info("Swaps " + swap);

            if (swap == 0) {
                log.info("Breaking the loop");
                return;
            }
        }
    }

    /**
     * Bubble Sort is an in-place sorting algorithm
     * i.e. space complexity is O(1)
     * hence, we shouldn't make a copy of the array and return it
     * @param array
     * @param <T>
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {

        for (int i=array.length-1; i>0; i--) {

            short swaps = 0;
            for (int j = 0; j < i; j++) {

                /** compareTo returns +ve value
                 *  if the current object is greater than
                 *  the other object
                 */
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }

            }
            log.info("Swaps " + swaps);

            /**
             * Best case scenario - O(Ω)
             * If the elements are already sorted,
             * it'll just run a single iteration comparison on
             * all the elements & breaks the loop
             */
           if (swaps == 0) {
                log.debug("Break loop");
                return;
           }
        }

    }


    /**
     * Select a minimum/max element in an array & compare with the rest
     * @param array
     * @param <T>
     */
    public static <T extends Comparable<T>> void selectionSort(T[] array) {

        //Iteration
        for (int i=0; i < array.length - 1; i++) {

            //Assume initial element index as minimum
            int minElementIndex = i;

            //Comparison
            for (int j = i+1;  j < array.length; j++) {

                //Minimum Element check
                //if (array[minElementIndex].compareTo(array[j]) < 0) { - For Descending order sort
                if (array[j].compareTo(array[minElementIndex]) < 0) {
                    minElementIndex = j;
                }
            }

            /**
             * If the current selected element is the minimum element
             * in the given array then we shouldn't swap
             */
            if (minElementIndex != i) {
                //Swap
                T temp = array[i];
                array[i] = array[minElementIndex];
                array[minElementIndex] = temp;
            }

        }

    }


    public static <T extends Comparable<T>> void insertionSort(T[] array) {

        //Start with the 2nd element in the array
        for(int i=1; i < array.length; i++) {
            //Store the 2nd element
            T current = array[i];
            //previous element index
            int j = i - 1;

            /**
             * Compare the 2nd(or)next element with the previous elements
             * and swap them
             */
            while ( j > -1 && current.compareTo(array[j]) < 0) {
                array[j+1] = array[j];
                array[j] = current;
                j--; //move j index to the   previous element
            }
        }
    }

}
