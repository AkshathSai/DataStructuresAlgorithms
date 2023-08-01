package org.example.algorithms.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sort<T extends Comparable<T>> {

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
            LOGGER.info("Swaps " + swaps);

            /** Not required since we're decrementing the
             *  iteration count in the main for-loop
             */
           /*if (swaps == 0) {
                LOGGER.debug("Break loop");
                break;
            }*/
        }

    }


    /**
     * Select a minimum/max element in an array & compare with the rest
     * @param array
     * @param <T>
     */
    public static <T extends Comparable<T>> void selectionSort(T[] array) {

        //Iteration
        for (int i=0; i < array.length; i++) {

            int minElementIndex = i;

            //Comparison
            for (int j = i+1;  j < array.length; j++) {

                //Minimum Element check
                if (array[j].compareTo(array[minElementIndex]) < 0) {
                    minElementIndex = j;
                }
            }

            /**
             * If the current selected element is the minimum element
             * in the given array then we shouldn't swap
             */
            if (i != minElementIndex) {
                //Swap
                T temp = array[i];
                array[i] = array[minElementIndex];
                array[minElementIndex] = temp;
            }

        }

    }




}
