package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseAnArray {

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 6, 5));
        reverseArray(integerList, 3);
    }

    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int startIndex = m+1;
        ArrayList<Integer> templist=new ArrayList<>();

        for(int i=arr.size()-1; i>=startIndex; i--){
            templist.add(arr.get(i));
        }

        System.out.println(templist.toString());
        int j=0;

        for(int i=startIndex; i<arr.size(); i++){
            arr.set(i, templist.get(j++));
        }

        System.out.println(arr.toString());
    }
}
