package com.oop.lessontwo.two;

import com.oop.lessonone.tasktwoone.InverseTransformer;
import com.oop.lessonone.tasktwoone.TextSaver;
import com.oop.lessonone.tasktwoone.TextTransformer;
import com.oop.lessonone.tasktwoone.UpDownTransformer;

import java.io.File;

class TextTransformAndSave {
    public static void main(String[] args) {
        TextSaver textSaver1 = new TextSaver(new TextTransformer(), new File("testSaver1.txt"));
        textSaver1.saveTextToFile("blablabla");

        TextSaver textSaver2 = new TextSaver(new InverseTransformer(), new File("textSaver2.txt"));
        textSaver2.saveTextToFile("qwerty");

        TextSaver textSaver3 = new TextSaver(new UpDownTransformer(), new File("textSaver3.txt"));
        textSaver3.saveTextToFile("asdfghjkzxcvbnm");
    }
}



