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



}
