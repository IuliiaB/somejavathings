package com.javastart.workwithfiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkwithFilesStart {
    public static void main(String[] args) {

//        String[] g = new String[]{"Mars", "Snikers", "Kontic", "Twix", "Water"};
//        int[] p = new int[]{25, 25, 15, 20, 16};
//        int[] n = new int[]{40, 60, 75, 30, 70};

        File file = new File("report.csv");
        String del = ";";

//        saveReport(file, del, g, p, n);

        String result = loadStringFromFile(file);
        System.out.println(result);
        //My
        System.out.println(lessSelledProductMy(file));

        //Alex
        String product = getProduct(breakByLineSeparator(result));
        System.out.println(product);


    }

    public static void saveReport(File file, String del, String[] g, int[] p, int[] n) {
        try (PrintWriter pw = new PrintWriter(file)) {

            for (int i = 0; i < g.length; i++) {
                pw.println(g[i] + del + p[i] + del + n[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadStringFromFile(File file) {
        String result = "";
        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                result += sc.nextLine() + System.lineSeparator();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.substring(0, result.length() - 1);
    }

    public static String lessSelledProductMy(File file) {
        String allInOne = loadStringFromFile(file);
        String[] productsDetailsArray = allInOne.split(System.lineSeparator());
        int lessSelled = Integer.valueOf(productsDetailsArray[0].split(";")[2]);
        String lessSelledProdName = productsDetailsArray[0].split(";")[0];
        for (int i = 1; i < productsDetailsArray.length; i++) {
            String[] prodDetailsArray = productsDetailsArray[i].split(";");
            String num = prodDetailsArray[2];
            if (Integer.valueOf(num) < lessSelled) {
                lessSelled = Integer.valueOf(num);
                lessSelledProdName = prodDetailsArray[0];
            }
        }
        return lessSelledProdName;
    }

    public static String[] breakByLineSeparator(String text) {
        return text.split(System.lineSeparator());
    }

    public static String getProduct(String[] products) {
        String result = products[0].split(";")[0];
        int n = Integer.valueOf(products[0].split(";")[2]);

        for (int i = 0; i < products.length; i++) {
            int curN = Integer.valueOf(products[i].split(";")[2]);
            if (n > curN) {
                n = curN;
                result = products[i].split(";")[0];
            }
        }
        return result;
    }

}
