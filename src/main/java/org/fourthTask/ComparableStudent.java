package org.fourthTask;


public class ComparableStudent implements Comparable<ComparableStudent>{

    private final Integer studentData;

    public ComparableStudent(Integer studentData) {
        this.studentData = studentData;
    }

    public int getCompStudentData() {
        return studentData;
    }

    @Override
    public int compareTo(ComparableStudent st) {
        if(studentData == st.studentData)
            return 0;
        else if(studentData < st.studentData)
            return 1;
        else
            return -1;
    }
}
