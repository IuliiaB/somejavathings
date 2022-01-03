package com.oop.lessonfive;

import java.io.File;
import java.io.IOException;

public class LessonFiveMain {
    public static void main(String[] args) {

//        File in = new File("/Users/iuliiababich/Downloads/oop/Enum.pdf");
//        File out = new File(in.getName());
//
//        try {
//            FileService.copyFile(in, out);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File folderIn = new File("/Users/iuliiababich/Downloads");
        File folderOut = new File("TMP");
        folderOut.mkdirs();
        try {
            FileService.copyFolder(folderIn, folderOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
