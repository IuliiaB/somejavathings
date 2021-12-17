package com.oop.lessonone.tasktwoone;

public class InverseTransformer extends TextTransformer {
    public InverseTransformer() {
    }

    @Override
    public String transform(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }
}