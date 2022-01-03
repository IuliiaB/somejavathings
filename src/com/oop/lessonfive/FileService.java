package com.oop.lessonfive;

import java.io.*;

public class FileService {
    public static void copyFile(File in, File out) throws IOException {
        try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
            is.transferTo(os);
        } catch (IOException e) {
            throw e;
        }
    }

    public static void copyFolder(File folderIn, File folderOut) throws IOException {
        File[] files = folderIn.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                copyFile(files[i], new File(folderOut, files[i].getName()));
            }
        }
    }
}
