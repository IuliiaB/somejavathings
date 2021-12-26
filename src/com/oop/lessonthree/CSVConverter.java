package com.oop.lessonthree;

public interface CSVConverter {
    public String toCSVString();
    public Student fromCSVString(String strs);
}
