package com.oop.lessonthree;

import java.io.File;
import java.io.IOException;

public class LessonFiveTasks {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Glen", "Glens Last Name", Gender.MALE, 1456);
        students[1] = new Student("Nastya-Larisa", "Mc'Alpha", Gender.FEMALE, 2345);
        students[2] = new Student("Alesya", "Pyato4kina", Gender.FEMALE, 8765);
        students[3] = new Student("Olga", "NeOlga", Gender.FEMALE, 5432);
        students[4] = new Student("Kolya", "Ay Kolin LastName", Gender.MALE, 2798);

        Group lessonFiveGroup = new Group("Lesson five Group");
        for (Student student : students) {
            try {
                lessonFiveGroup.addStudent(student);
            } catch (GroupOverflowException e) {
                e.printStackTrace();
            }
        }

        try {
            GroupFileStorage.saveGroupToCSV(lessonFiveGroup);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File groupCsv = GroupFileStorage.findFileByGroupName("one more group", new File("groups"));
            Group lessonFiveFromCsv = GroupFileStorage.loadGroupFromCSV(groupCsv);
            System.out.println("Group from new csv:" + System.lineSeparator() + lessonFiveFromCsv);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }
    }
}
