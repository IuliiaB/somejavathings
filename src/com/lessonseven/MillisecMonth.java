package com.lessonseven;

import java.util.Calendar;

public class MillisecMonth {
    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();
        Calendar lastMonth = Calendar.getInstance();
        lastMonth.set(Calendar.MONTH,today.get(Calendar.MONTH)-1);
        System.out.println(String.format("There are %d milliseconds between %tD and %tD",
                today.getTimeInMillis() - lastMonth.getTimeInMillis(), today.getTime(), lastMonth.getTime()));
    }

}
