package com.oop.lessonthree;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    String groupName;
    Student[] students = new Student[10];

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public Group(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(sortStudentsByLastName()) +
                '}';
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                if (student !=null) {
                    student.setGroupName(this.getGroupName());
                }
                break;
            }
            if (i == students.length - 1) {
                throw new GroupOverflowException("The group is full");
            }
        }
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        Student result = null;
        for (Student student : students) {
            if (student != null) {
                if (student.getLastName().equals(lastName))
                    result = student;
            }
        }
        if (result == null) {
            throw new StudentNotFoundException("There is no student with this last name in this group");
        }
        return result;
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public Student[] sortStudentsByLastName() {
        Arrays.sort(students, Comparator.nullsLast(new StudentLastNameComparator()));
        return students;
    }
}
