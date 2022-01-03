package com.oop.lessonfive;

import java.io.File;
import java.io.IOException;

public class LessonFiveHomework {
    public static void main(String[] args) {
        File dirFrom = new File("/Users/iuliiababich/Downloads/oop");
        File dirTo = new File("oopfivedirto");
        dirTo.mkdirs();
        try {
            copyFiles(dirFrom, dirTo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copyFiles(File dirFrom, File dirTo) throws IOException {
        for (File file : dirFrom.listFiles()) {
            String fileName = file.getName();
            if (file.isFile() && fileName.substring(fileName.length() - 4).compareTo(".pdf") == 0) {
                FileService.copyFile(file, new File(dirTo, fileName));
            }
        }

    }
}
