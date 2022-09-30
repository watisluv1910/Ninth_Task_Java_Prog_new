package org.secondTask;

import org.myApp.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {

    public void sort(ArrayList<Student> students) {
        Student[] tempArray = students.toArray(new Student[students.size()]);

        Arrays.sort(tempArray, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) { // Descending order comp
                return a.getStudentData() < b.getStudentData() ? 1 : a.getStudentData() == b.getStudentData() ? 0 : -1;
            }
        });

        arrayToList(students, tempArray);
    }

    private void arrayToList(ArrayList<Student> studentsList, Student[] studentsArray) {

        for (int i = 0; i < studentsList.size(); i++) {

            studentsList.set(i, studentsArray[i]);
        }
    }
}
