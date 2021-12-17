package com.oop.lessonone.tasktwoone;

public class UpDownTransformer extends TextTransformer {
    public UpDownTransformer() {
    }

    @Override
    public String transform(String text) {
        char[] stringElements = text.toCharArray();
        String result = "";
        for (int i = 0; i < stringElements.length; i++) {
            if (i % 2 == 0) {
                result = result + Character.toString(stringElements[i]).toUpperCase();
            } else {
                result = result + Character.toString(stringElements[i]).toLowerCase();
            }
        }
        return result;
    }
}

