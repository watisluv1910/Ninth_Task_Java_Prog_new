package org.thirdTask;

import org.myApp.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByMerge {

    public ArrayList<Student> sort(ArrayList<Student> listA, ArrayList<Student> listB) throws NullPointerException {

        if (listA == null) {
            throw new NullPointerException("First list is null");
        } else if (listB == null) {
            throw new NullPointerException("Second list is null");
        } else {
            ArrayList<Student> result = new ArrayList<>(listA.size() + listB.size());

            result.addAll(listA);
            result.addAll(listB);

            result.sort(new Comparator<Student>() {
                @Override
                public int compare(Student a, Student b) { // Ascending order comp
                    return a.getStudentData() < b.getStudentData() ? -1 : a.getStudentData() == b.getStudentData() ? 0 : 1;
                }
            });

            return result;
        }
    }
}
