package com.oop.lessonthree;

import java.util.Scanner;

public class AddNewStudentFromKeyboard {

    public static Student addNewStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student's first name:");
        String firstName = sc.nextLine();
        System.out.println("Please enter student's last name:");
        String lastName = sc.nextLine();
        System.out.println("Please enter student's gender");
        String genderEntered = sc.nextLine();
        System.out.println("Please enter student's id:");
        int id = sc.nextInt();
        Gender gender;
        switch (genderEntered) {
            case "female":
                gender = Gender.FEMALE;
                break;
            case "male":
                gender = Gender.MALE;
                break;
            default:
                throw new RuntimeException("The entered gender is incorrect");
        }
        return new Student(firstName, lastName, gender, id);
    }

    public static void addStudentToTheGroup(Student student, Group group) {
        student.setGroupName(group.getGroupName());
        try {
            group.addStudent(student);
        } catch (GroupOverflowException e) {
            System.out.println("There is an exception " + e.getClass() + ". Group is full");
        }
    }
}
