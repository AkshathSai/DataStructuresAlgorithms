package org.example.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSorter {

    public static void main(String[] args) {

        List<Student> list = List.of(
                new Student(101, "Akshath"),
                new Student(3, "Vini"),
                new Student(2, "Cherry"),
                new Student(6, "Susmitha"));


        List<Student> studentList = new ArrayList<>(list);

        System.out.println(studentList);

        /** Without passing Comparator Interface
         */
        //Collections.sort(studentList);
        //System.out.println("Sorted order\n" + studentList);

        /** Now that comparator is implemented we can sort it in two ways
         *  1. Collections.sort()
         *  2. List.sort()
         */
        //Collections.sort(studentList, new AscendingOrderStudentComparator());
        studentList.sort(new AscendingOrderStudentComparator());
        System.out.println("Ascending order sort \n" + studentList);

        Collections.sort(studentList, new DescendingOrderStudentComparator());
        System.out.println("Descending order sort \n" + studentList);
    }
}
