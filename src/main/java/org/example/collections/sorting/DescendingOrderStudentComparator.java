package org.example.collections.sorting;

import java.util.Comparator;

public class DescendingOrderStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getStudentId(), o1.getStudentId());
    }
}
