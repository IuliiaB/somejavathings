package com.oop.lessonthree;

public class LessonThreeMain {
    public static void main(String[] args) {
        Student student1 = new Student("Glen", "Glens Last Name", Gender.MALE, 1456);
        Student student2 = new Student("Nastya-Larisa", "Mc'Alpha", Gender.FEMALE, 2345);
        Student student3 = new Student("Alesya", "Pyato4kina", Gender.FEMALE, 8765);
        Student student4 = new Student("Olga", "NeOlga", Gender.FEMALE, 5432);
        Student student5 = new Student("Kolya", "Ay Kolin LastName", Gender.MALE, 2798);

        Group groupOne = new Group("Group One");
        try {
            groupOne.addStudent(student1);
            student1.setGroupName(groupOne.getGroupName());
            groupOne.addStudent(student2);
            student2.setGroupName(groupOne.getGroupName());
            groupOne.addStudent(student3);
            student3.setGroupName(groupOne.getGroupName());
            groupOne.addStudent(student4);
            student4.setGroupName(groupOne.getGroupName());
            groupOne.addStudent(student5);
            student5.setGroupName(groupOne.getGroupName());
        } catch (GroupOverflowException e) {
            System.out.println("There is an exception " + e.getClass() + ". Group is full");
        }
        System.out.println("Just formed group");
        System.out.println(groupOne);

        String[] lastNamesToSearch = {"Olala", "NeOlga", "Neolga"};
        for (String lastName : lastNamesToSearch) {
            try {
                groupOne.searchStudentByLastName(lastName);
                System.out.println("There is a student with last name " + lastName);
            } catch (StudentNotFoundException e) {
                System.out.println("There is no such student in the group " + groupOne.getGroupName() + " with last name " + lastName);
            }
        }

        int[] studentsIdsToDel = {10, 5432};
        for (int id : studentsIdsToDel) {
            if (groupOne.removeStudentByID(id)) {
                System.out.println("Student with id " + id + " was deleted.");
            } else {
                System.out.println("There is no student with id " + id);
            }
        }

        System.out.println("Group after change:");
        System.out.println(groupOne);
    }
}
