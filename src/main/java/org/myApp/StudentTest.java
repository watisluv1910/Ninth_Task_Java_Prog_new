package org.myApp;

import java.util.ArrayList;

public class StudentTest {

    private ArrayList<Student> students;

    public StudentTest() {
        students = new ArrayList<>();
    }

    public StudentTest(ArrayList<Student> students) {
        this.students = students;
    }

    public void setStudentsData() {
        int currData = -1;

        while (true) {

            currData = MyInput.inputInteger("Enter new student's data:", Integer::valueOf);

            if (currData > 0) {
                students.add(new Student(currData));
            } else {
                break;
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void printStudents() {

        System.out.println("Result student's data:");

        for (Student student : students) {
            System.out.println(student.getStudentData());
        }
    }
}