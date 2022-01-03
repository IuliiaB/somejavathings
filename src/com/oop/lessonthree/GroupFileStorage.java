package com.oop.lessonthree;

import java.io.*;

public class GroupFileStorage {
    public static void saveGroupToCSV(Group group) throws IOException {
        File groupsDir = new File("groups");
        groupsDir.mkdirs();
        File groupCsv = new File(groupsDir, group.getGroupName() + ".csv");

        try (FileWriter fileWriter = new FileWriter(groupCsv)) {
            for (Student student : group.getStudents()) {
                if (student != null) {
                    fileWriter.write(student.toCSVString() + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public static Group loadGroupFromCSV(File file) throws IOException, GroupOverflowException {
        Group group = new Group(file.getName().substring(0, file.getName().length() - 4));
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            for (; ; ) {
                String row = bufferedReader.readLine();
                if (row == null) {
                    break;
                }
                group.addStudent(new Student().fromCSVString(row));
            }
        } catch (IOException e) {
            throw e;
        }
        return group;
    }

    public static File findFileByGroupName(String groupName, File workFolder) {
        File[] files = workFolder.listFiles();
        for (File file : files) {
            if (file.getName().substring(0, file.getName().length() - 4).compareTo(groupName) == 0) {
                return file;
            }
        }
        return null;
    }
}
