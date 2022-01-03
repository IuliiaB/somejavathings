package com.javastart.workwithfiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FilesHomework {
    public static void main(String[] args) {
        File file1 = new File("savedText.txt");
        myTextEditor(file1);

        File file2 = new File("array.txt");
        int dimensionI = 5;
        int dimensionJ = 4;
        int[][] arr = new int[dimensionI][dimensionJ];
        for (int i = 0; i < dimensionI; i++) {
            for (int j = 0; j < dimensionJ; j++) {
                arr[i][j] = i + j;
            }
        }
        saveTwoDimensionArrayTFile(arr, file2);

        printAllDirs(".");

        System.out.println(Arrays.deepToString(readTwoDimensionArrayFromFile(file2)));

        getLettersNumber(new File("text.txt"));

        printFigureToFile(new File("printedArrow.txt"));
    }

    public static void myTextEditor(File file) {
        Scanner sc = new Scanner(System.in);
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < 5; i++) {
                pw.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveTwoDimensionArrayTFile(int[][] arr, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    pw.print(arr[i][j]);
                    if (j < arr[0].length - 1) {
                        pw.print(";");
                    }
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printAllDirs(String path) {
        File dir = new File(path);
        if (dir.isDirectory()) {
            File[] allFiles = dir.listFiles();
            for (File file : allFiles) {
                if (file.isDirectory()) {
                    System.out.println(file);
                }
            }
        }
        if (dir.isFile()) {
            System.out.println("Provided path directs to a file. Skip");
        }
    }

    public static int[] getArrayLengths(File file) {
        int rowsNum = 0;
        int columnsNum = 0;
        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                rowsNum++;
                columnsNum = sc.nextLine().split(";").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] result = new int[]{rowsNum, columnsNum};
        return result;
    }

    public static int[][] readTwoDimensionArrayFromFile(File file) {
        int[] dims = getArrayLengths(file);
        int[][] result = new int[dims[0]][dims[1]];
        try (Scanner sc = new Scanner(file)) {
            int i = 0;
            for (; sc.hasNextLine(); ) {
                String[] row = sc.nextLine().split(";");
                for (int j = 0; j < row.length; j++) {
                    result[i][j] = Integer.valueOf(row[j]);
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void getLettersNumber(File file) {
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
        // a b c d e f g h i j k   l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
        String[] englishLetters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] nums = new int[englishLetters.length];
        for (int i = 0; i < englishLetters.length; i++) {
            nums[i] = 0;
        }

        fillArrayFromFile(nums, file, englishLetters);
        int tempNum = 0;
        String tempLetter = "";
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < englishLetters.length; j++) {
                if (nums[j - 1] < nums[j]) {
                    tempNum = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tempNum;
                    tempLetter = englishLetters[j];
                    englishLetters[j] = englishLetters[j - 1];
                    englishLetters[j - 1] = tempLetter;
                }
            }
        }
        for (int i = 0; i < englishLetters.length; i++) {
            System.out.println(englishLetters[i] + " - " + nums[i]);
        }

    }

    public static int[] fillArrayFromFile(int[] arr, File file, String[] alphabet) {

        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                char[] lettersInARow = sc.nextLine().toCharArray();
                for (char symbol : lettersInARow) {
                    for (int cnt = 0; cnt < alphabet.length; cnt++) {
                        if (alphabet[cnt].compareTo(Character.toString(symbol).toLowerCase()) == 0) {
                            arr[cnt] = arr[cnt] + 1;
                            break;
                        }
                    }
                }
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }

    public static void printFigureToFile(File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            int num = 40;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i < num / 2) {
                        if ((j >= num / 2 - 1 - i) && (j <= num / 2 + i)) {
                            pw.print("*");
                        } else {
                            pw.print("_");
                        }
                    } else {
                        if ((j >= num / 4) && (j <= num * 3 / 4)) {
                            pw.print("|");
                        } else if (j < num / 4) {
                            pw.print("\\");
                        } else {
                            pw.print("/");
                        }
                    }
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
