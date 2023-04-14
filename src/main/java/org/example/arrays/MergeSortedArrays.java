package org.example.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int arr1[] = new int[]{5, 3, 2, 8, 7};
        int arr2[] = new int[]{8, 11, 10, 13, 15};

        //Arrays.stream(mergeSort(arr1, arr2)).forEach(System.out::println);
        System.out.println(Arrays.toString(mergeSort(arr1, arr2)));
    }

    private static int[] mergeSort(int arr1[], int arr2[]) {

        //Checking the input
        if (arr1.length == 0) {
            return arr2;
        }

        if (arr2.length == 0) {
            return arr1;
        }

        int mergedArray[] = new int[arr1.length + arr2.length];

        int i=0, j=0, k=0;

        //Adding all the elements of Array1 to mergedArray
        while (i<arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        //Adding all the elements of Array2 to mergedArray
        while (j<arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        Arrays.sort(mergedArray);

        return mergedArray;

    }


}
