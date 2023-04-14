package org.example.collections.sorting;

public class Student {

    private int studentId;
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student() {
        //(default) no argument constructor
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId + " " + studentName;
    }

    /*@Override
    public int compareTo(Student o) {
        //return Integer.compare(this.studentId, o.studentId); //For ascending order sorting (Natural order sorting)
        return Integer.compare(o.studentId, this.studentId); //For descending order sorting
    }*/

}
