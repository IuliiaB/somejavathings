package com.oop.lessonfive;

import java.io.*;
import java.util.Arrays;

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

    public static boolean compareTwoFiles(File file1, File file2) throws IOException {
        byte[] buffer1 = new byte[100];
        byte[] buffer2 = new byte[100];
        try (InputStream inputStream1 = new FileInputStream(file1); InputStream inputStream2 = new FileInputStream(file2)) {
            for (; ; ) {
                int readBytes1 = inputStream1.read(buffer1);
                int readBytes2 = inputStream2.read(buffer2);
                if (readBytes1 != readBytes2) {
                    return false;
                }
                if (Arrays.compare(buffer1, buffer2) != 0) {
                    return false;
                } else if ((readBytes1 <= 0) && (readBytes1 == readBytes2) && (Arrays.compare(buffer1, buffer2) == 0)) {
                    return true;
                }
            }
        } catch (IOException e) {
            throw e;
        }
    }
}
