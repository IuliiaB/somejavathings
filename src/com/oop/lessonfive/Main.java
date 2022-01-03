package com.oop.lessonfive;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("main.log")) {
            File file1 = new File(args[0]);
            File file2 = new File(args[1]);
            File file3 = new File(args[2]);
            pw.println(FileService.compareTwiFiles(file1, file2));
            pw.println(FileService.compareTwiFiles(file1, file3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// from src run:
// javac com/oop/lessonfive/FileService.java com/oop/lessonfive/Main.java
// java com.oop.lessonfive.Main ../groups/thirdGroup.csv "../groups/thirdGroup Copy.csv" "../groups/one more group.csv"
