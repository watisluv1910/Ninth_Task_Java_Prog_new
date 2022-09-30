package org.myApp;

import org.firstTask.SortingStudentsByInsert;
import org.secondTask.SortingStudentsByGPA;
import org.thirdTask.SortingStudentsByMerge;

public class App {

    public static void main(String[] args) {

        while (true) {

            Integer navigationVar = MyInput.inputInteger("""
                    Navigation menu:
                    Enter 1 to start 1st task.
                    Enter 2 to start 2nd task.
                    Enter 3 to start 3rd task.
                    Enter any other digit to stop the program.""", Integer::valueOf);

            switch (navigationVar) {
                case 1: {
                    StudentTest studentTest = new StudentTest();
                    studentTest.setStudentsData();
                    SortingStudentsByInsert insertionSort = new SortingStudentsByInsert();
                    insertionSort.sort(studentTest.getStudents());
                    studentTest.printStudents();
                    break;
                }
                case 2: {
                    StudentTest studentTest = new StudentTest();
                    studentTest.setStudentsData();
                    SortingStudentsByGPA quickSort = new SortingStudentsByGPA();
                    quickSort.sort(studentTest.getStudents());
                    studentTest.printStudents();
                    break;
                }
                case 3: {
                    StudentTest studentTest1 = new StudentTest();
                    studentTest1.setStudentsData();
                    StudentTest studentTest2 = new StudentTest();
                    studentTest2.setStudentsData();
                    SortingStudentsByMerge mergeSort = new SortingStudentsByMerge();
                    StudentTest result = new StudentTest(mergeSort.sort(studentTest1.getStudents(), studentTest2.getStudents()));
                    result.printStudents();
                    break;
                }
                default:
                    System.exit(1);
                    break;
            }
        }
    }
}
