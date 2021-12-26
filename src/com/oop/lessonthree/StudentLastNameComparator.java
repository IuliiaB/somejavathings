package com.oop.lessonthree;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        String student1LastName = student1.getLastName();
        String student2LastName = student2.getLastName();

        if (student1LastName.compareTo(student2LastName) > 0) {
            return 1;
        }
        if (student1LastName.compareTo(student2LastName) < 0) {
            return -1;
        }

        return 0;
    }
}
