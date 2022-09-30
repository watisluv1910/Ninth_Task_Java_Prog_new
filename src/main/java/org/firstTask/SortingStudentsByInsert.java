package org.firstTask;

import org.myApp.Student;

import java.util.ArrayList;

public class SortingStudentsByInsert {

    public void sort(ArrayList<Student> students) {

        for (int i = 0; i < students.size(); i++) {

            int key = students.get(i).getStudentData();
            int j = i - 1;

            while (j >= 0 && students.get(j).getStudentData() > key) {

                students.set(j + 1, students.get(j));
                j--;
            }

            students.set(j + 1, new Student(key));
        }
    }
}
