package com.oop.lessonthree;

public class Student extends Human implements CSVConverter{
    private int id;
    private String groupName;

    public Student() {

    }

    public Student(int id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public Student(String name, String lastName, Gender gender, int id) {
        super(name, lastName, gender);
        this.id = id;
    }

    public Student(String name, String lastName, Gender gender, int id, String groupName) {
        super(name, lastName, gender);
        this.id = id;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", gender=" + super.getGender() +
                ", id=" + id +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    @Override
    public String toCSVString() {
        return this.getName()+";"+this.getLastName()+";"+this.getGender()+";"+this.getId()+";"+this.getGroupName();
    }

    @Override
    public Student fromCSVString(String strs) {
        String[] studentProps = strs.split(";");
        return new Student(studentProps[0],studentProps[1], Gender.valueOf(studentProps[2]), Integer.valueOf(studentProps[3]), studentProps[4]);
    }
}
