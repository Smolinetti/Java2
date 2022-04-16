package ru.java2.lessons.lesson_3;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Task1 {

    private static final String[] INPUT_DATA = {"a", "b", "b", "b", "c", "d", "e", "e", "f", "g", "g", "g", "h", "g", "i", "a"};


    public static void main(String[] args) {

        Map<String, Integer> frequencyByWord = new TreeMap<>();

        for (String word : INPUT_DATA) {


            frequencyByWord.merge(word, 1, Integer::sum);
        }

        frequencyByWord.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String word, Integer frequency) {
                System.out.printf("%s - встречается -> %d%n", word, frequency);
            }
        });
    }
}
